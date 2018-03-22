// get user address
window.onload = function (ev) {
    $("#address-li-template").hide();
    $.get(
        "/getUserAddress",
        function (result) {
            showAddress(result);
        }
    );
};

function showAddress(data) {
    var addressCount = data.length;
    for (var i = 0; i < addressCount; i++) {
        var addressRow = $("#address-li-template").clone(true).appendTo(".address-list");
        addressRow.find(".user-addr").children("span").text(data[i].addressInfo);
        addressRow.find(".user-addr").children("em").text(data[i].phoneNumber);
        addressRow.attr("class", "address-wrap address-li");
        addressRow.find(".hidden-id").attr("value", data[i].addressId);
        console.log(addressRow.find(".hidden-id").attr("value"));
        if (data[i].isDefaultAddress) {
            addressRow.addClass("selected");
            addressRow.find("input").prop("checked", true);
            $(".confirmAddr-addr").children(".confirmAddr-addr-bd").text(data[i].addressInfo);
            $(".confirmAddr-addr-user").children(".confirmAddr-addr-bd").text(data[i].phoneNumber);
        }
        else {
            addressRow.find("input").prop("checked", false);
        }
        addressRow.show();
    }
}

$(".addressInput").click(function () {
    var addressInfo = $(this).parents("li").find(".user-addr").children("span").text();
    var phoneNumber = $(this).parents("li").find(".user-addr").children("em").text();
    $(".confirmAddr-addr").children(".confirmAddr-addr-bd").text(addressInfo);
    $(".confirmAddr-addr-user").children(".confirmAddr-addr-bd").text(phoneNumber);
});

// set the style of addresses
$(document).ready(function(){
    $(".addressInput").change(function(){
        $(".addressInput").each(function() {
            $(this).parents('.address-wrap').first().removeClass('selected');
        });
        $(this).parents('.address-wrap').first().addClass('selected');
    });
});

function showImage(productRow, productID) {
    $.get(
        "/productImageInCart",
        {productID: productID},
        function (result) {
            productRow.children(".cart_product").find("img").attr("src", result);
        }
    );
}

function reComputeAll() {
    var total = 0;
    $(".product-tr").each(function () {
        total += parseFloat($(this).children(".cart_total").find("p").text());
    });
    $(".realPay-price").text(total);

    if (total == 0) {
        console.log("zero le");
        window.location.href = "cart.html";
    }
}

// listen to delete <a>
$(".cart_quantity_delete").click(function () {
   $(this).parents("tr").remove();
   reComputeAll();
});