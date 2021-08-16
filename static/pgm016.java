<code class="applykey">	<div class="nextline">	<span></span><span>	public class pgm016 {						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	private static int rmvdulpele(int[] a, int len) {					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	if(len== 1 || len== 0){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	return len;			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int j=0;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	System.out.println("Totel Length - "+len);				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	for(int i=0;i< len-1;i++){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	if(a[i] != a[i+1]){			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">					<span>&emsp;&emsp;&emsp;&emsp;</span><span>	a[j++] = a[i];		<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	}			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	a[j++] = a[len-1];				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	return j;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	}					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	public static void main(String[] args) {					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	//Sorted array				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int a[]={10,60,20,30,40,40,80,50};				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	int len = a.length;				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	//Un-Sorted array				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	Arrays.sort(a);				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	len = rmvdulpele(a,len);				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	for(int i=0;i<len;i++){				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">				<span>&emsp;&emsp;&emsp;</span><span>	System.out.print(a[i]+" ");			<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">			<span>&emsp;&emsp;</span><span>	}				<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">		<span>&emsp;</span><span>	}					<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">								<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	}						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	/*						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	Totel Length - 8						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	->10 20 30 40 50 60 80 						<br> </span>  </div> </code>
<code class="applykey">	<div class="nextline">	<span></span><span>	 */						<br> </span>  </div> </code>
