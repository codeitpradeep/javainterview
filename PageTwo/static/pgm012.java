<code class="applykey">	<div class="nextline">	<span></span><span>	public class pgm012 {						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	private static  int getfact(int i) {					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	// TODO Auto-generated method stub				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	if(i==0){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	return 1;			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	return i*getfact(i-1);				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	}					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	public static void main(String[] args) {					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int i= 6;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	//recursive				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	System.out.println("Fact of 14 -"+getfact(i));				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	System.out.println("For using Fact");				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	long fact = 1;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int num = i;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	for(int m=1;m <= num; ++m){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	//fact = fact * m			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	fact *= m;			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	System.out.println("//"+fact);				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	}					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	}						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	/*						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Fact of 14 -720						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	For using Fact						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	//720						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	 */						<br> </span>  </div> </code>
