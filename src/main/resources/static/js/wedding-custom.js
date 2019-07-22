/*
<div class="thumbnail registry-card" style="width: 12rem;">
    <img src="img/registry_cat.jpg" class="card-img-top img-rounded" alt="..." style="width:100%">
    <div class="caption">
        <h5>A THIRD Cat!!</h5>
        <p>Kitty &amp; Beaker need a new friend</p>
        <p style="margin-bottom:0px">Cost: $500.00</p>
        <div class="progress">
        <div
            class="progress-bar"
            style="width:60%">$301.25</div>
    </div>
    <a href="#" class="btn btn-primary">Donate</a>
    </div>
</div>
    */
var cat = {
    title: "A THIRD Cat!!",
    imgSrc: "registry_cat.jpg",
    subText: "Kitty & Beaker need a new friend",
    cost: 500.0,
    progress: 301.25
};

var card = document.createElement("div");
$(card).addClass("thumbnail registry-card")

var img = document.createElement("img");
var imgSrc = "img/" + cat.imgSrc;
$(img).attr({
    src: imgSrc,
    class: "card-img-top img-rounded",
    style: "width: 100%"
})

var caption = document.createElement("div");
$(caption).addClass("caption");
var h5 = $("<h5></h5>").text(cat.title);
$(caption).append(h5);
var subText = $("<p></p>").text(cat.subText);
$(caption).append(subText);
var cost = $("<p></p>").addClass("registry-cost").text("$"+cat.cost);
$(caption).append(cost);

var progress = $("<div></div>").addClass("progress")
var percent = cat.progress/cat.cost;
var progressBar = $("<div></div>").addClass("progress-bar").attr("style","width:"+100*percent.toFixed(2)+"%");

$(progress).append(progressBar);
$(caption).append(progress);
$(card).append(img);
$(card).append(caption);
$("#registry-container").append(card);