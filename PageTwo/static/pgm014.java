<code class="applykey">	<div class="nextline">	<span></span><span>	public class pgm014 {						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	public static void main(String[] args) {					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	System.out.println("Method 1 -");				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	String str = "Radar",revstr="";				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int len = str.length();				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	for(int i=(len-1);i>=0; --i){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	revstr =revstr+str.charAt(i);			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	System.out.println(revstr);			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	if(revstr.equalsIgnoreCase(str)){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	System.out.println(revstr);			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	System.out.println("Method 2 -");				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int num = 353,revsnum=0, rem;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int orglnum = num;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	while(num != 0){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	rem = num % 10;			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	revsnum = revsnum *10 + rem;			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	num=num/10;			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	if(orglnum==revsnum){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	System.out.println(revsnum);			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	}					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	}						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	/*						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Method 1 -						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	r						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	ra						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	rad						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	rada						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	radaR						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	radaR						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Method 2 -						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	353						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	 */						<br> </span>  </div> </code>
