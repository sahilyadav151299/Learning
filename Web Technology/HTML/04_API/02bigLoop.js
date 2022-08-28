
 var no=0;
 function bigLoop(){
     for(var i=0;i<=10000000000;i++){
     no=i;
    }
}

bigLoop();
postMessage(no);