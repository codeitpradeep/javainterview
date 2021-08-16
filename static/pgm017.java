<code class="applykey">	<div class="nextline">	<span></span><span>	public class pgm017 {						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	public static void main(String[] args) {					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int a[] = {10,20,5,6,6,1,2,2,20,5,10};				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int j=0;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int b[] = new int[a.length];				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	for(int m=0;m<a.length;m++){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	for(int n= m+1;n< a.length; n++){			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	//System.out.println(m+" "+n);		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	if(a[m] == a[n]){		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">						<span>&emsp;&emsp;&emsp;&emsp;</span><span>	System.out.println("Dulp- "+a[m]);	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	}		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	}			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	}					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	}						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	/*						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Dulp- 10						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Dulp- 20						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Dulp- 5						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Dulp- 6						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Dulp- 2						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	 */						<br> </span>  </div> </code>
