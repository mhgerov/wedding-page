
/*<div class="thumbnail registry-card" style="width: 12rem;">
    <img src="img/registry_cat.jpg" class="card-img-top img-rounded" alt="..." style="width:100%">
    <div class="caption">
    <h5>A THIRD Cat!!</h5>
<p>Kitty &amp; Beaker need a new friend</p>
<p style="margin-bottom:0px">Cost: $500.00</p>
<div class="progress">
    <div
class="progress-bar"
role="progressbar"
aria-valuenow="60"
aria-valuemin="0"
aria-valuemax="100"
style="width:60%">$301.25</div>
</div>
<a href="#" class="btn btn-primary">Donate</a>
    </div>
    </div>*/
var cat = {
  title: "A THIRD Cat!!",
  caption: "Kitty &amp; Beaker need a new friend",
  cost: 500,
  progress: 301.25
};

var card = document.createElement("div");

$("#registry-container").append(card);