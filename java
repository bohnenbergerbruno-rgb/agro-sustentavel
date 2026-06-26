function rolar(){

window.scrollTo({

top:600,

behavior:"smooth"

});

}

const cards=document.querySelectorAll(".card");

cards.forEach(card=>{

card.addEventListener("mouseover",()=>{

card.style.boxShadow="0 10px 25px rgba(0,120,0,.4)";

});

card.addEventListener("mouseout",()=>{

card.style.boxShadow="0 5px 15px rgba(0,0,0,.2)";

});

});
