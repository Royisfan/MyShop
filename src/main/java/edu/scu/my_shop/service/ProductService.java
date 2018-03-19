package edu.scu.my_shop.service;

import edu.scu.my_shop.dao.ProductMapper;
import edu.scu.my_shop.dao.SecondCategoryMapper;
import edu.scu.my_shop.entity.Product;
import edu.scu.my_shop.entity.ProductExample;
import edu.scu.my_shop.entity.SecondCategory;
import edu.scu.my_shop.exception.ProductException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static edu.scu.my_shop.exception.ProductException.*;

/**
 * Created by Vicent_Chen on 2018/3/18.
 */
@Service
public class ProductService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    /**
     * Validate all information that a product needs <b>EXCEPT</b> ID.
     * @param product
     * @return
     */
    private boolean validateProductExceptID(Product product) {

        if (product == null) {
            throw new ProductException(PRODUCT_IS_NULL_MESSAGE, PRODUCT_IS_NULL);
        }

        String name = product.getProductName();
        if (name == null || name.equals("")) {
            throw new ProductException(PRODUCT_NAME_EMPTY_MESSAGE, PRODUCT_NAME_EMPTY);
        }

        Double price = product.getProductPrice();
        if (price == null) {
            throw new ProductException(PRODUCT_PRICE_EMPTY_MESSAGE, PRODUCT_PRICE_EMPTY);
        }

        Integer total = product.getProductLeftTotals();
        if (total == null) {
            throw new ProductException(PRODUCT_TOTAL_EMPTY_MESSAGE, PRODUCT_TOTAL_EMPTY);
        }

        String secondCategoryID = product.getSecondCategoryId();
        if (secondCategoryID == null || secondCategoryID.equals("")) {
            throw new ProductException(PRODUCT_CATEGORY_EMPTY_MESSAGE, PRODUCT_CATEGORY_EMPTY);
        }

        SqlSession sqlSession = sqlSessionFactory.openSession();
        SecondCategoryMapper secondCategoryMapper = sqlSession.getMapper(SecondCategoryMapper.class);
        SecondCategory secondCategory = secondCategoryMapper.selectByPrimaryKey(secondCategoryID);
        if (secondCategory == null) {
            sqlSession.close();
            throw new ProductException(PRODUCT_CATEGORY_ERROR_MESSAGE, PRODUCT_CATEGORY_ERROR);
        }

        sqlSession.close();
        return true;
    }

    /**
     * Insert product object from browser to database.
     * Automatically generate product id.
     * Duplicate insert will be treated as two different insert with different product id.
     * @param product
     */
    public void insertProduct(Product product) {

        validateProductExceptID(product);

        // currently use UUID as product ID
        // duplicate insert will be treated as two different insert with different p_id
        product.setProductId(UUID.randomUUID().toString());

        // insert product into database, sqlSession already opened
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        productMapper.insertSelective(product);
        sqlSession.close();
    }

    /**
     * Delete product from database by primary key.
     * Automatically ignore product that not exist.
     * Theoretically pid cannot be null, otherwise it will not compile.
     * @param pid
     */
    public void deleteProduct(String pid) {
        // validate product id
        if (pid == null || pid.equals("")) {
            throw new ProductException(PRODUCT_ID_EMPTY_MESSAGE, PRODUCT_ID_EMPTY);
        }

        // TODO: delete product image

        // delete product from database
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        productMapper.deleteByPrimaryKey(pid);
        sqlSession.close();
    }

    /**
     * Delete product from database by primary key.
     * Automatically ignore product that not exist.
     * Theoretically product cannot be null, otherwise it will not compile.
     * @param product
     */
    public void deleteProduct(Product product) {
        // validate product data
        if (product == null) {
            throw new ProductException(PRODUCT_IS_NULL_MESSAGE, PRODUCT_IS_NULL);
        }

        deleteProduct(product.getProductId());
    }

    /**
     * Update product selectively(All can be null <b>EXCEPT ID</b>).
     * Automatically ignore product that not exist.
     * No need to validate every data since it update selectively.
     * @param product
     */
    public void updateProduct(Product product) {

        // validate product data
        if (product == null) {
            throw new ProductException(PRODUCT_IS_NULL_MESSAGE, PRODUCT_IS_NULL);
        }
        String productID = product.getProductId();
        if (productID == null || productID.equals("")) {
            throw new ProductException(PRODUCT_ID_EMPTY_MESSAGE, PRODUCT_ID_EMPTY);
        }

        // TODO: update image

        // update database
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        productMapper.updateByPrimaryKeySelective(product);
        sqlSession.close();
    }

    /**
     * Selete all product records in database.
     * FIXME: check whether it returns null or empty list
     * @return
     */
    public List<Product> getAllProducts() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        List<Product> productList = productMapper.selectByExample(new ProductExample());
        sqlSession.close();
        return productList;
    }

    /**
     * Search for a product by its ID.
     * It's deprecated since no one can know the auto-generated UUID.
     * @param productID
     * @return
     */
    @Deprecated
    public Product searchProductByID(String productID) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        Product product = productMapper.selectByPrimaryKey(productID);
        sqlSession.close();
        return product;
    }
}
