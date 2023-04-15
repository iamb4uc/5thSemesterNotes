# Define significant digits.
**The significant figures of a given number are those significant or ==important digits, which convey the meaning according to its accuracy.==**

*OR*

**The concept of significant digits has been introduced primarily to indicate the accuracy of a numerical value**

For example, 6.658 has four significant digits. These substantial figures provide precision to the numbers. They are also termed as significant digits.

# What is error?
An error in numerical calculation is the ==difference between a true value and an estimate or approximation of that value.==

There are different types of error in numerical calculation
1. **Inheritance error:** Inheritance errors are those ==error that are present in the data supplied to the model. This is also known as input error.== These contain components namely: 
	1. **Data error:** Data error also known as empirical errors. ==Data error arises when data for a problem are obtained by some experimental means and therefore of limited accuracy and precision.==
	2. **Conversion error:** Also known as representation error. It arises dues to the limitation of the computer to store the data exactly.
2. **Numerical Error:** 
	1. **Round-off/Rounding error:** Also called arithmetic error are an unavoidable consequence of working in finite precision arithmetic. We will deal with this error in the context of polynomial evaluation and solving linear equations.
	2. **Truncation error:** Also known as approximation error, these type of errors are much harder to analyze. We will deal with them in the context of solving differential equations. Many standard numerical methods can be derived by taking many terms of a taylor series.
3. **Absolute error:** It is the ==magnitude of the difference between a measurement compared to a true value.== $$ Absolute\ Error = |True\ value - Measured\ Value|$$
6. **Relative error:** Relative error shows the size of error relative to the true value. Basically , it puts the size of the error into perspective $$ Relative\ Error=\frac{Absolute\ Error}{True\ value} $$
5. **Percentage error:** Percentage error is the error that can is obtained when we find the percentage of the relative error. It can be expressed as follows:$$Percentage\ error = Relative\ Error\text{ x }100\% $$
# Taxonomy of errors
![[Pasted image 20230209133525.png]]

# What do you mean by floating point representation?
Floating-point representation is a way that computers store numbers with a decimal point. It allows computers to store both large and small numbers with a limited number of digits, but can sometimes result in small inaccuracies because not all numbers can be represented exactly.

# Transcendental equation
Equation of the type $f(x)= 0$ can be either algebraic or transcendental.

The equation $f(x)= 0$ is called  an algebraic if $f(x)$ is an algebraic polynomial.
 
If  $f(x)$ contains functions like trigonometric, logarithmic, exponential, etc then $f(x)= 0$ is called a transcendental equations.

In general, an equation is solved by factorization, but in many cases, the method of factorization fails. In such cases numerical methods are used. Various methods to solve $f(x)=0$ are:
- Bisection Method Or olzano method
- Regular-Falsi method Or False- Position method
- Newton-Rephson method Or Newton’s  Iteration method etc.

# Regula-falsi method $(x^6=x^4+x^3+1)$
This is the most oldest method for finding the real root of a numerical equation $f(x)=0$. To find the real root of the equation $f(x)=0$, We consider a sufficiently small interval($x_1,x_2$) in which the root lies. Since the root lies in the interval ($x_1,x_2$) the curve must cross the axis of x in between ($x_1,x_2$) and hence $y_1=f(x_1), y_2=f(x_2)$ have opposite signs. This method is based on the principal that any portion of a smooth curve is practically straight for a short distance and hence we may say that the x-coordinate of the point of intersection of the straight line joining ($x_1,y_1$), ($x_2,y_2$) and the axis of x gives an appropriate value of the desired root. By the figure it is obvious that $X=OP$ is the approximate value of the desired root whereas $X=OQ$ is the actual value of the root. Now we shall derive a formula to compute the root.

We have,
$$
OP = OA + AP = X_1 + AP
$$
The triangle DPA and DRC are similar, so we have
$$
\begin{align*}
\frac{DA}{AP} = \frac{DR}{CR} \Rightarrow AP= \frac{CR}{CR}DA &=\frac{(x-x_1)DA}{DA+AR}\\
&=\frac{(x_2-x_1)|y_1|}{|y_1|+|y_2|}\\
\end{align*}
$$
$$
\begin{align*}
\because OP-OA &= \frac{|X_2-X_1|\ |Y_1|}{|Y_1|+|Y_2|}\\
\Rightarrow OP &= X_1 + \frac{|X_2-X_1|\ |Y_1|}{|Y_1|+|Y_2|}\\
&=\text{Desired value of the root}
\end{align*}
$$

Let this desired value (*which is approximate*) be represented by $x^{(1)}$, then to find the better approximation, we evaluate $y^{(1)}$ by $y^{(1)}=f(x^{(1)})$. Now either $y^{(1)}$ & $Y_1$ or $y^{(1)}$ and $Y_2$ will be opposite signs. In case $y^{(1)}$ & $y_1$ are opposite signs then one root will lie the interval ($X_1, X^{(1)}$). Now again apply the method of false position to this, N interval to get second approximation. In case $y^{(1)}$ and $y_2$ are opposite signs then second approximation is obtained by using the method of false position to the interval ($X^{(1)},x_2$).

# Accuracy and precision
## Accuracy
It is the closeness of the measured value to a standard or true value. In other way we say that Accuracy is defined as ‘the degree to which the result of a measurement conforms to the correct value or a standard’ and essentially refers to how close a measurement is to its agreed value.
## Precision
Precision is defined as ‘the quality of being exact’ and refers to how close two or more measurement are to each other, regardless of whether those measurements are accurate or not. It is possible for precision measurements to not be accurate.

# Interpolation method
Interpolation is the technique of estimating approximately the value of the dependent variable corresponding to a value of the independent variable, between its two extreme value of the independent and dependent variable.
## Assumptions of interpolation
The application of the principal of interpolation is subject of the following assumptions:
1. There is no certain jumps in figure from one period to another period.
2. The rate of change of figures is uniform overtime.

# Newton's Forward Interpolation
It is to be used to estimate the value of the depended variable corresponding to a given value of the independent variable
1. If the independent variable $x$ increases by equal intervals.
2. The value of $x$ corresponding to which the value of $y$ is to be interpolated in the 1st hub of the series.

The formula is 
$$
\begin{align*}
  f(x)=f(x_0)+U\Delta f(x_0) &+ \frac{U(U-1)}{2!}\Delta^2f(x_0)+\frac{U(U-1)
  (U-2)}{3!}\Delta^3f(x_0)\\
                             &+ \dots+\frac{U(U-1)(U-2)\dots\{U-(n-1)\}}{n!}
                             \Delta^nf(x_0)\\
                             \\
                             &\text{where }U=(\frac{x-x_0}{h})\text{and }h
                             \text{ is the interval of differencing.}
\end{align*}
$$
## Derivation
Let, $y=f(x)$, be a function, 
Here, the argument's $x_0,x_1,\dots.x_n$ are equidistant. $x_1-x_0=x_2-x_1=\dots=x_n-x_{n-1}=h$ 
Let us take a polynomial of $n^{th}$ degree as our interpolation formula. 
Let 
$$
\begin{equation}
f(x)=a_0+a_1(x-x_0)+a_2(x-x_0)(x-x_1)+\dots+a_3(x-x_0)(x-x_1)\dots(x-x_{n-1})\dots\dots(1)
\end{equation}
$$

where $a_0,a_1,\dots,a_n$ are the constants to be determined.

Now, putting $x=x_0$ in equation number (1)
$$
f(x_0)=a_0
$$
Again, putting $x=x_1$ in equation (1)
$$
\begin{align*}

  f(x_1)&=a_0+a_1(x_1-x_0)\\
  \Rightarrow f(x_1)&=f(x_0)+a_1*h\\
  \Rightarrow a_1 &=\frac{f(x_1)-f(x_0)}{h}\\
  &=\frac{\Delta f(x_0)}{h}
\end{align*}
$$
Again, putting $x=x_2$ in equation (1)
$$
\begin{align*}
              f(x_2)  &= a_0+a_1(x_2-x_0)+a_2(x_2-x_0)(x_2-x_1)\\
  \Rightarrow f(x_2)  &= f(x_0)+\frac{\Delta f(x_0)}{h}(x_2-x_1+x_1-x_0)\\ &+ a_2(x_2-x_1+x_1-x_0)(x_2-x_1)\\
  \Rightarrow f(x_2)  &= f(x_0)+\frac{\Delta f(x_0)}{h}*2h+a_2*2h*h\\
  \Rightarrow f(x_2)  &= f(x_0)+2\Delta f(x_0)+2h^2a_2\\
  \Rightarrow a_2     &= \frac{f(x_2)-2\Delta f(x_0)-f(x_0)}{2h^2}\\
  \Rightarrow a_2     &= \frac{f(x_2)-2f(x_1)+2f(x_0)-f(x_0)}{2h^2}\\
                      &= \frac{f(x_2)-2f(x_1)+f(x_0)}{2!h^2}\\
                      &= \frac{\Delta^2 f(x_0)}{2!h^2}
\end{align*}
$$

Again, putting $x=x_3$ is equation (1)
$$
\begin{equation*}
  a_3=\frac{\Delta^3f(x_0)}{3!h^3}\\
\end{equation*}
$$
............
..................
Similarly, putting $x=x_n$ in equation (1)
$$
a_n=\frac{\Delta^nf(x_0)}{n!h^n}
$$
Now putting the value of $a_0,a_1,a_2,a_3,\dots,a_n$ in equation (1), we get,
$$
f(x)=f(x_0)+\frac{\Delta f(x_0)}{h}(x-x_0)+\frac{\Delta^2f(x_0)}{2!h^2}(x-x_0)(x-x_1)
$$
$$
+\frac{\Delta^3f(x_0)}{3!h^3}(x-x_0)(x-x_1)(x-x_2)
$$
$$
+\dots+\frac{\Delta^nf(x_0)}{n!h^n}(x-x_0)(x-x_1)\dots(x-x_{n-1})\dots\dots(2)
$$
Let us put $U=\frac{x-x_0}{h}$ in equation (2)
$$
\begin{align*}
  f(x)&=f(x_0)+U\Delta f(x_0)+\frac{U(U-1)}{2!}\Delta^2f(x_0)+\frac{U(U-1)(U-2)}{3!}\Delta^3f(x_0)\\
  &+\dots+\frac{U(U-1)\dots\{U-(n-1)\}}{n!}\Delta^nf(x_0)
\end{align*}
$$

# Newton's Backwards Interpolation
Let, $f(x)$ be a polynomial  of degree $n$ and $n+1$ equidistant values of $x$ along then corresponding values of $f(x)$. The Newton's backward interpolation formula is
$$
\begin{align*}
  f(x) &= f(x_n)+U\nabla f(x_n-1)+\frac{U(U+1)}{2!}\nabla^2f(x_n-2)+\frac{U(U+1)(U+2)}{3!}\nabla^3f(x_n-3)\\
       &+\dots+\frac{U(U+1)\dots\{U+(n-1)\}}{n!}\nabla^nf(x_0)
\end{align*}
$$

where, $U=\frac{(x-x_n)}{h}$, where h is the interval of differences.

The Newton's backward interpolation formula is used to estimate values of the dependent  variable corresponding to a given value of the independent variable.

1. The independent variable $x$ increases by equal intervals.
2. The value of $x$ corresponding to each value of $y$ is to be interpolated in the $2^{nd}$ half of the series.

# Gauss Jordan
This method is a modification over Gauss elimination method. In this method the elimination is performed not only the equation below but also the equation above. Those we finally get a diagonal coefficient matrix and hence the solution is obtained without further competition.

# Gauss Elimination
In this method the variable forms the system of linear equations are eliminating successively and the system of equation is therefore reduced to a upper triangular system from which the variable determined by back substitution.

# Lagrange's Interpolation
Let, $f(x_0),f(x_1),\dots,f(x_n)$ be the entries corresponding to the argument $x_0,x_1,\dots,x_n$ which are not necessarily in equal intervals. The interpolation formula given by Lagrange to estimate the value of $y$ corresponding to a value of $x$ between any two consecutive values of the given values is

$$
\begin{align*}
  f(x)&=\frac{(x-x_1)(x-x_2)\dots(x-x_n)}{(x_0-x_1)(x_0-x_2)\dots(x_0-x_n)}f(x_0)+\frac{(x-x_0)(x-x_2)\dots(x-x_n)}{(x_1-x_0)(x_1-x_2)\dots(x_1-x_n)}f(x_1)\\
  &+ \dots +\frac{(x-x_1)(x-x_2)\dots(x-x_{n-1})}{(x_n-x_0)(x_n-x_1)\dots(x_n-x_{n-1})}f(x_n)
\end{align*}
$$

Lagrange's Interpolation formula is usually and when the values of the independent variable $x$ are not equidistant. To apply Lagrange's formula the value of $x$ corresponding to which the value of $y$ is to be interpolated may be anywhere in between the first and last terms.

*To apply Lagrange's formula, construction of difference table is not needed.*


# Simpson's 3/8th rule
The general quadrature formula is
$$
\begin{align*}
  I &=\int_{a=x_0}^{b=x_0+nh}f(x)dx\\
    &= h[ny_0+\frac{n^2}{2}\Delta y_0+(\frac{n^3}{3}-\frac{n^2}{2})\frac{\Delta^2y_0}{2!}+(\frac{n^4}{4}-n^3+n^2)\frac{\Delta^3y_0}{3!}\\
    &+ \dots+upto\ (n+1)\ terms]
\end{align*}
$$

Putting $n=3$ and neglicting all the difference higher than $3^{rd}$ order.

$$
\begin{align*}
  I_1=\int_{x_0}^{x_0+3h}f(x)dx &= h[3y_0+\frac{3}{2}\Delta y_0+(\frac{27}{3}-\frac{9}{2})\frac{\Delta^2y_0}{2!}+(\frac{81}{4}-27+9)\frac{\Delta^3y_0}{3!}]\\
                          &= h[3y_0+\frac{3}{2}(y_1-y_0)+(9-\frac{9}{2})(\frac{y_2-2y_1+y_0}{2})+(\frac{81}{4}-27+9)\\
                          &  (\frac{y_3-3y_2+3y_1-y_0}{6})]\\
                          \ \\ 
                          &= h[3y_0+\frac{9}{2}(y_1-y_0)+\frac{9}{3}(\frac{y_2-2y_1+y_0}{2})+\frac{3}{8}(y_3-3_2+3y_1-y_0)]\\
                          &= \frac{3h}{8}[8y_0+12(y_1-y_0)+6(y_2-2y_1+y_0)+(y_3-3y_2+3y_1-y_0)]\\
                          &= \frac{3h}{8}[y_0+3y_1+3y_2+y_3]\\
\end{align*}
$$

Similarly,

$$
\begin{align*}
  \int_{x_0+3h}^{x_0+6h}f(x)dx &= \frac{3h}{8}[y_3+3y_4+3y_5+y_6]\\
\end{align*}
$$
.....
.........
$$
\begin{align*}
  \int_{x_0+(n-3)h}^{x_0+nh}f(x)dx &= \frac{3h}{8}[y_{n-3}+3y_{n-2}+3y_{n-1}+y_n]\\
\end{align*}
$$

Adding all the integrals,

$$
\begin{align*}
  \int_{x_0}^{x_0+nh}f(x)dx=\frac{3h}{8}[(y_0+y_n) &+ 3(y_1+y_2+y_4+y_5+\dots+y_{n-1})\\
                                                   &+ 2(y_3+y_6+\dots+y_{n-3})]
\end{align*}
$$

This formula is known as Simpson's $\frac{3}{8}^{rd}$ formula.

Conditions for validity of Simpson's $\frac{3}{8}^{rd}$ rule.
- $f(x)$ should be a polynomial of degree 3 of the form  $f(x)=a+6x+cx^2+dx^3$
- The value of $x$ should be equidistant.
- The number of division of the interval $(x_0,x_0+nh)$ should be multiple of 3 like 3, 6, 9, etc.

# What is simpson's 1/3rd rule
The general quadrature formula is 
$$
\begin{align*}
  I &=\int_{a=x_0}^{b=x_0+nh}f(x)dx\\
    &= h[ny_0+\frac{n^2}{2}\Delta y_0+(\frac{n^3}{3}-\frac{n^2}{2})\frac{\Delta^2y_0}{2!}+(\frac{n^4}{4}-n^3+n^2)\frac{\Delta^3y_0}{3!}\\
    &+ \dots+upto\ (n+1)\ terms]
\end{align*}
$$
Putting $n=2$ and neglecting all the differences higher then second order. 
$$
\begin{align*}
  I_1=\int_{a=x_0}^{b=x_0+2h}f(x)dx &= h[2y_0+2\Delta y_0+(\frac{8}{3}-2)\frac{\Delta^2y_0}{2!}]\\
                                    &= h[2y_0+2(y_1-y_0)+(\frac{8}{3}-2)\frac{y_2-2y_1+y_0}{2}]\\
                                    &= h[2y_0+2y_1-2y_0+\frac{2}{3}*\frac{y_2-2y_1+y_0}{2}]\\
                                    &= h[2y_1+\frac{y_2-2y_1+y_0}{3}]\\
                                    &= h[\frac{6y_1+y_2-2y_1+y_0}{3}]\\
                                    &= h[\frac{y_0+4y_1+y2}{3}]\\
                                    &= \frac{h}{3}(y_0+4y_1+y_2)
\end{align*}
$$
Simillarly, 
$$
\begin{align*}
  I_4=\int_{x_0+2h}^{x_0+4h}f(x)dx &= \frac{h}{3}(y_2+4y_3+y_4)
\end{align*}
$$

And, 
$$
\begin{align*}
  I_n=\int_{x_0+(n-2)h}^{x_0+nh}f(x)dx &= \frac{h}{3}(y_{n-2}+4y_{n-1}+y_n)
\end{align*}
$$

On adding all these integrals, we get: 
$$
\begin{align*}
  \int_{x_0}^{x_0+nh}f(x)dx &= \frac{h}{3}(y_0+y_n)+4(y_1+y_3+\dots+y_{n-1})+2(y_2+y_4+\dots+y_{n-2})
\end{align*}
$$
This formula is known as Simpson's $\frac{1}{3}^{rd}$ formula.

Condition for validity of Simpson's $\frac{1}{3}^{rd}$ rule.
- $f(x)$ should be a polynomial of degree 2 of the form $f(x)=a+bx+cx^2$
- The values of x should be equidistant
- The number of division of the interval $(x_0,x_0+nh)$ should be multiple of 2 like 2, 4, 6, 8, 10, etc.

# What is numerical integration
Numerical Integration is the process of finding or evaluating definite integral is 

$I=\int_{a}^{b}f(x)dx$ from a set of numerical value of the integrate $f(x)$. If it is applied to the integration of a function of a single variable then the process is known as quadrature. The problem of numerical integration is solved by first approximating the integrate by a polynomial with the help of an interpolation formula and then integrating this expression between the desired limits.
$$
\begin{align*}
  \int xdx&=\frac{x^2}{2}\\
  \int x^ndx&=\frac{x^{n+1}}{n+1}
\end{align*}
$$

# Eular's method
Eular method is the simplest one step method and hence a limited application beccause of its low accuracy.
## Formula
$$
y_{i+h} = y_i+hf(x_i, y_i)
$$

# What is RK method
This method are named after two german mathematicians, Carl Range and Wilheln Kutta. This was developed to avoid the computation of higher order derivatives in taylor method. The RK method are designed to give greater accuracy and posses the advantages of aquireing only the function values at some
selected points on the sub interval.

# What is modified eulars method
# Trapezoidal rule. How to use trapezoidal rule application $\Rightarrow\int_0^6f(x)=\frac{1}{1+x}dx$ 
The general quadrature formula is

$$
\begin{align*}
  I &=\int_{a=x_0}^{b=x_0+nh}f(x)dx\\
    &= h[ny_0+\frac{n^2}{2}\Delta y_0+(\frac{n^3}{3}-\frac{n^2}{2})\frac{\Delta^2y_0}{2!}+(\frac{n^4}{4}-n^3+n^2)\frac{\Delta^3y_0}{3!}
\end{align*}
$$
$$
\begin{align}
    &+ \dots+upto\ (n+1)\ terms]\dots\dots(3)
\end{align}
$$

Putting $n=1$ in equation number (3), and neglecting all the difference higher than 1, we get:
$$
\begin{align*}
  I_1 &= \int_{x_0}^{x_0+h}f(x)dx\\
      &= h[y_0+\frac{1}{2}\Delta y_0]\\
      &= h[y_0+\frac{1}{2}(y_1-y_0)]\\
      &= h[\frac{2y_0+y_1-y_0}{2}]\\
      &= h[\frac{y_0+y_1}{2}]
\end{align*}
$$

Similarly,
$$
\begin{align*}
  I_2 &= \int_{x_0+h}^{x_0+2h}f(x)dx = h[\frac{y_1+y_2}{2}]\\
  I_3 &= \int_{x_0+2h}^{x_0+3h}f(x)dx = h[\frac{y_2+y_3}{2}]
\end{align*}
$$
......
........
$$
\begin{align*}
  I_n &= \int_{x_0+(n-1)h}^{x_0+nh}f(x)dx = h[\frac{y_{(n-1)}+y_n}{2}]
\end{align*}
$$
Adding these n integrals we get
$$
\begin{align*}
  \int_{x_0}^{x_0+nh}f(x)dx &= h[(\frac{y_0-y_1}{2})+(\frac{y_1-y_2}{2})+\dots+(\frac{y_{(n-1)}+y_n}{2})]\\
                            &= h[(\frac{y_0+y_n}{2})+(y_1+y_2+y_3+\dots+y_{n-1})]
\end{align*}
$$
This is called the Trapezoidal Rule.

Condition for validity of trapezoidal rule:
- $f(x)$ should be a polynomial of degree of 1, i.e. a  straight line of the form $f(x)=a+bx$
- The value of $x$ should be equidistant
- The number of divisions of the integral $(x_0,x_0+nh)$  should be multiple of 1, like 3, 5, 7, etc.

# Mathematical expectation
The mathematical expectation of a random variable of X is the sum of product of the values taken by the random variable and their respective probability and it is denoted by $E(x)$

If $x$ is a discrete random variable then
$$
E(x)=\sum_x xP(x),\text{ where $P(x)$ is the probability mass function of $x$}
$$
If $x$ is the continuous random variable then expectation is
$$
E(x)=\int_a^b xf(x)dx,\text{ where $x$ is the probability density function of $x$}
$$

# Normal Distribution
A random variable $X$ is said to have a normal distribution with parameters $\mu$ (mean) and $\sigma^2$(variance). The probability density function is
$$
f(x,\mu,\sigma)=\frac{1}{\sqrt{2\pi \sigma^2}}e^{-(x-\mu)^2/2\sigma^2}
$$
where,
$$
\begin{align*}
-\infty<x<\infty,\\
-\infty<\mu<\infty,\\
\sigma>0
\end{align*}
$$
# Poisson distribution
A discrete random variable $X$ is said to follow with parameters “$\lambda$” if it assumes the non-negative integral values and its probability mass function is given by
$$
\begin{align*}
P(X=x)=\{_0^{\infty}\frac{e^{\lambda}\lambda^x}{x!}, \ \ \ \ \ \ \ \ \ \ \ \ \ \ &x=0,1,2,\dots,\infty\\
&\lambda>0
\end{align*}
$$
# Binomial distribution
The binomial distribution is a discrete distribution that models the number of successful customers in a fixed number of independent Bernoulli trials.

The probability mass function is given by 
$$
\begin{align*}
P(X=x) = \{_0^n c_xp^xp^{n-1},\ \ \ \ \ \ \ \ \ \ \ \ \ \ \  \ \ \ \ \ \ \ &x=0,1,\dots,n\\
&p+q=1
\end{align*}
$$
