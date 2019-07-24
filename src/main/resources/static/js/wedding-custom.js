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
var registryItems = [{
    title: "A THIRD Cat!!",
    imgSrc: "registry_cat.jpg",
    subText: "Kitty & Beaker need a new friend",
    cost: 500.0,
    progress: 301.25
}];

function generateRegistry(registryArray) {
    for (var i = 0; i < registryArray.length; i++) {
        var card = $("<div></div>").addClass("thumbnail registry-card");
        var img = document.createElement("img");
        $(img).attr({
            src: "img/" + registryArray[i].imgSrc,
            class: "card-img-top img-rounded",
            style: "width: 100%"
        })
        var caption = $("<div></div>").addClass("caption");
        var h5 = $("<h5></h5>").text(registryArray[i].title);
        var subText = $("<p></p>").text(registryArray[i].subText);
        var cost = $("<p></p>").addClass("registry-cost").text("$" + registryArray[i].cost);
        var progress = $("<div></div>").addClass("progress")
        var progressBar = $("<div></div>")
            .addClass("progress-bar")
            .attr("style", "width:" + (100 * registryArray[i].progress / registryArray[i].cost).toFixed(2) + "%")
            .text("$" + (registryArray[i].progress).toFixed(2));
        $(progress).append(progressBar);
        var button = $("<button></button>").addClass("btn btn-primary").attr("type", "button").text("Donate");
        $(caption).append(h5, subText, cost, progress);
        $(card).append(img, caption, button);
        $("#registry-container").append(card);

    }
}

