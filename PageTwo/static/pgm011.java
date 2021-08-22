<code class="applykey">	<div class="nextline">	<span></span><span>	public class pgm011 {						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	public static void main(String[] args) {					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int num = 29;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	boolean flag = false;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	for(int i=2; i <= num/2 ; ++i){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	//System.out.println(num+"%"+i);			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	if(num % i == 0){			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	flag = true;		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	break;		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	}else{			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	flag = false;		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	}			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	if(!flag){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	System.out.println("prime -"+num);			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}else{				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	System.out.println("Not prime -"+num);			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	//find all prime in M to N 				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	System.out.println("prime in M 20 to N 41");				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int m=20,n=41;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	flag = false;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	while(m <= n){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	//System.out.println(m);			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	for(int i=2; i < m/2 ;++i){			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	if(m % i == 0){		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">							flag = true;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">							break;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	}else{		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">							flag = false;	<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	}		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	}			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	if(!flag && m!=0 && m!=1 ){			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	System.out.println("prime -"+m);		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	}else{			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	}			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	++m;			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	}					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	}						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	/*						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	prime -29						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	prime in M 20 to N 41						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	prime -23						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	prime -29						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	prime -31						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	prime -37						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	prime -41						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	 */						<br> </span>  </div> </code>
