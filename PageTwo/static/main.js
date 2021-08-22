

gettextherejson()
function gettextherejson(){
    fetch('./PageTwo/static/users.json')
    .then((res) => res.json())
    .then((data) => {
        console.log(data)
        let output = ``
        data.forEach(function(user){
            output += `
           <div class="pgm__content lang_items ">
                    <div class="topic__code tpc-javhints " primary = "${"get"+user.no}">
                        <h1>${user.qus}</h1>
                    </div>
                    <div class="contnt-javhints hide_sec ${"hide_secget"+user.no}">
                    <div class="code__contianer">
                       
                        <div class="output__code">
                           
                           <div class="output__content ">
                           <div class="answrdisplay" id = "addanswer${user.ans}">

                           </div>    
                           </div>
                           <div class="pgm__code">
                            <h3>Code -</h3>
                            <p>Program </p>
                            <div class="code__pythoncd" id = "pgmaddanswer${user.no}">
                                
                            
                            </div>
                            </div>
                           <!--div class="syntax__code">
                            <h3>Program or Syntax-</h3>
                            <span>public static void main(String[] args){ <br>
                            }</span>
                            </div -->
                        </div>
                       
                        <div class="img__codehint">

                        </div>
                    </div>
                    </div>
                </div>   
            `
        })
        document.getElementById('show__all').innerHTML = output;
        
    } )
}

/*
const javhintsttpc = document.querySelector('.tpc-javhints');
const javhintssectn = document.querySelector('.contnt-javhints');
const javhintsview = document.querySelector('.tpc-javhintsview');
//tpc-javhintsview





//presstopicjv2();



javhintsttpc.addEventListener('click' , presstopicjv)

function presstopicjv(e){
    javhintssectn.style.display = 'block';
    javhintsttpc.style.display = 'none';
    //min-height
}
javhintsview.addEventListener('click' , presstopicjv2)

function presstopicjv2(e){
    javhintsttpc.style.display = 'block';
    javhintssectn.style.display = 'none';
    
}

var keytoken = ['public static void','public','out','extends','this','while','void','sdt','new','implements','static']
var datatypes = ['println','print','interface','String','class1','class2','abstract','int']
//applykey
let applykey = document.querySelectorAll('.applykey');
for(var tdtk of datatypes){
for(let a of applykey){
    var str = a.innerHTML;
    var alls =str.replaceAll(tdtk,`<span class="key_002">${tdtk}</span>`);
    a.innerHTML = alls;
}
}
for(var tk of keytoken){
    for(let a of applykey){
        var str = a.innerHTML;
        var alls =str.replaceAll(tk,`<span class="key_001">${tk}</span>`);
        a.innerHTML = alls;
    }
    }


*/


gettextherejson2()
function gettextherejson2(){
    fetch('./PageTwo/static/users.json')
    .then((res) => res.json())
    .then((data) => {
        console.log(data)
        let output = ``
        data.forEach(function(user){
            gettexthere(user.ans)
          
        })
       
        
    } )
}
gettextherejson3()
function gettextherejson3(){
    fetch('./PageTwo/static/users.json')
    .then((res) => res.json())
    .then((data) => {
        console.log(data)
        let output = ``
        data.forEach(function(user){
            
           getpgmhere(user.no)
        })
       
        
    } )
}

    async function loadFileAndPrintToConsole(url) {
        let path = "./PageTwo/static/"+url+".txt";
        let dataret ;
        try {
          const response = await fetch(path);
          const data = await response.text();
         // console.log(data);
         dataret = data
        } catch (err) {
            console.error("Please upload ...",url,"+txt");
        }
        return dataret
      }
      async function loadFileAndPrintToConsole2(url) {
        let path = "./PageTwo/static/"+url+".java";
        let dataret ;
        try {
          const response = await fetch(path);
          const data = await response.text();
         // console.log(data);
         dataret = data
        } catch (err) {
          console.error("Please upload ...",url,"+txt");
        }
        return dataret
      }

function gettexthere(filename){
      loadFileAndPrintToConsole(filename).then((data) =>{ 
          //console.log(data)
          if(data.includes('Cannot GET')){

          }else{
            document.getElementById("addanswer"+filename).innerHTML = data;
          }
         
        })
      
}  
function getpgmhere(filename){
    loadFileAndPrintToConsole2("pgm"+filename).then((data2) =>{ 
        console.log(filename)
        //pgmaddanswerans001
        if(data2.includes('Cannot GET')){

        }else{
            document.getElementById("pgmaddanswer"+filename).innerHTML = data2;
        }
        
      })
    
} 
//  getpgmhere 


var checkExist = setInterval(function() {
    if (document.querySelectorAll('.topic__code').length) {
       console.log("Exists!");
       clearInterval(checkExist);
       callhereafter();
    }
 }, 100);



async function callhereafter(){
let topic_show = document.querySelectorAll('.topic__code')

topic_show.forEach(c => c.addEventListener('click' , openslide))

}

function openslide(){
    console.log("ki",this.getAttribute('primary'))
    //
    let tittles = document.querySelectorAll('.contnt-javhints')
    let hideppty = document.querySelector(`.hide_sec${this.getAttribute('primary')}`)

    console.log("ki",hideppty.getAttribute('class'))
    console.log("ki",hideppty.getAttribute('class').includes("active"))
    if(hideppty.getAttribute('class').includes("active")){
        hideppty.classList.remove('active')
    }else{
        tittles.forEach(c => c.classList.remove('active'))


        hideppty.classList.add('active')
    }
    

    
    //
}