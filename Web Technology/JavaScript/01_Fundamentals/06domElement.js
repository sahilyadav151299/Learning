// Styling DOM Elements

const header = document.getElementById('message');

header.style.color = 'red';
header.style.fontSize = '50px';

// Detecting Button Clicks

const button = document.getElementById('see-review');

button.addEventListener('click', function(){
    alert('Reviewed');
});

// Showing Hiding Elements

const btn = document.getElementById('show');

btn.addEventListener('click', function(){

    if(!btn.classList.contains('d-none')){
        btn.classList.add('d-none');
        btn.textContent = 'Hide';
    }
    else{
        btn.classList.remove('d-none');
        btn.textContent = 'Show';
    }
});