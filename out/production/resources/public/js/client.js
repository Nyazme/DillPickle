var position =0;
var arrayOfBlurbs = [];

$(document).ready(function() { //when DOM is ready run the code
    //$("#getBlurbs").on("click", function () {

    $.ajax({
        type: "GET",
        url: "/hotdog",
        success: function (serverData) {
            arrayOfBlurbs = serverData.blurbs;
            updateDom(arrayOfBlurbs);
            // console.log("serverData");
            console.log(arrayOfBlurbs);
            //appendPeople(peeps.people);
        }
    });
    $("#btnPrev").on("click", function () {
        prevBtn()
    });
    $("#btnNext").on("click", function () {
        nextBtn()
    });
});

function prevBtn() {
    console.log("click");
    position--;//iterate position down by one
    if (position < 0) {//If evaluates value of position; if any value less than 0, it will:
        position = 9;//set value of position to 9
    }
    if (position === 9) {//If evaluates of position, if = 9 it will
        $("#0").removeClass("highlight");//remove highlt class from Div 0
        updateDom()
    } else {
        $("#" + (position + 1)).removeClass("highlight");
        updateDom()
    }
}
function nextBtn() {
    position++;//iterate position up by one
        if (position > 9) {//If evaluates value of position; if any value greater than 9, it will:
            position = 0;//set value of position to 0
        }
        if (position === 0) {//If eval value of position; if = to 0, it will:
            $("#9").removeClass("highlight");//remove highlight class from Div 9;
            updateDom()//run function updateDOM()
            } else {
                $("#" + (position - 1)).removeClass("highlight");//remove highlt class from div one # less than position
                updateDom()//run function updateDom()
            }
}
function updateDom() {
    $("#" + (position)).addClass("highlight");//adds highlt class to whatever DiV Id matches current value of position.
    $("#nameText").text(arrayOfBlurbs[position].name); //changes txtName element to array value matching value of position.
    $("#mentionText").text(arrayOfBlurbs[position].mention);//changes txtBlurb element to array value matching value of position.
        }



