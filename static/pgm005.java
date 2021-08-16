<code class="applykey">	<div class="nextline">	<span></span><span>	public class pgm005 {	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	 public static void main(String[] args) {	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  int a =4 ;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  int b =6 ;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  swapapprochone(a,b);	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  swapapprochtwo(a,b);	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	 }	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	 public static void swapapprochtwo(int a, int b) {	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  System.out.println("Approach 2-");	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  a = a - b; //-2	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  b = a + b; //4	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  a = b - a; //6	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  System.out.printf("Swap after - %d , %d \n" ,	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	    a ,b );	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	 }	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	 public static void swapapprochone(int a, int b) {	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  System.out.printf("Swap before - %d , %d \n" ,	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	    a ,b );	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  System.out.println("Approach 1-");	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  int temp = 0;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  a = b;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  temp = b;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  a = temp;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	  System.out.printf("Swap after - %d , %d \n" ,	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	    a ,b );	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	 }	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	}	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	/*	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Swap before - 4 , 6	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Approach 1-	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Swap after - 6 , 6	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Approach 2-	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Swap after - 6 , 4	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	 */	<br> </span>  </div> </code>
