<code class="applykey">	<div class="nextline">	<span></span><span>	class Myclg{	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	 String name ;	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	 static String dept = "CSE";	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	 public Myclg(String name, String d) {	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;&emsp;</span><span>	  this.name = name;	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	 }	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	 void showname(){	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;&emsp;</span><span>	  System.out.printf("%s dept is %s \n" ,name , dept );	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	 }	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	}	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;</span><span>	public class staticone {	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	 public static void main(String[] args) {	<br> </span>  </div> </code>
                                    <br>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;&emsp;</span><span>	  Myclg clg = new Myclg("Pradeep","");	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;&emsp;</span><span>	  clg.showname();	<br> </span>  </div> </code>
                                <br>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;&emsp;</span><span>	  System.out.printf("dept is %s\n"  , Myclg.dept );	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;&emsp;</span><span>	   //public static double sqrt(double a) internal call	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;&emsp;</span><span>System.out.printf("MATH is %f"  , Math.sqrt(900.0));<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span>&emsp;&emsp;</span><span>	 }	<br> </span>  </div> </code>
								<code class="applykey">	<div class="nextline">	<span></span><span>	}	<br> </span>  </div> </code>
