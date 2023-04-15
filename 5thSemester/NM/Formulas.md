### Newton Forward
$$
\begin{align*}
	f(x)=f(x_0)+U\Delta f(x_0)+\frac{U(U-1)}{2!}\Delta^2f(x_0)+\frac{U(U − 1)(U − 2)}{3!}\Delta^3f(x_0)\\
  
	+\dots+\frac{U(U − 1)(U − 2)\dots{U − (n − 1)}}{n!}\Delta^nf(x_0)
\end{align*}
$$

### Newton Backward
$$
\begin{align*}
	 f(x)=f(x_n)+U\nabla f(x_n-1) + \frac{U(U+1)}{2!}\nabla^2f(x_n-2)+\frac{U(U+1)(U+2)}{3!}\nabla^3f(x_n-3)\\
   
    + \dots+\frac{U(U+1)\dots\{U+(n-1)\}}{n!}\nabla^nf(x_0)
\end{align*}
$$

### Lagrange's Interpolation formula
$$
\begin{align*}
    f(x)=\frac{(x-x_1)(x-x_2)\dots(x-x_n)}{(x_0-x_1)(x_0-x_2)\dots(x_0-x_n)}f(x_0)+\frac{(x-x_0)(x-x_2)\dots(x-x_n)}{(x_1-x_0)(x_1-x_2)\dots(x_1-x_n)}f(x_1)\\

    + \dots +\frac{(x-x_1)(x-x_2)\dots(x-x_{n-1})}{(x_n-x_0)(x_n-x_1)\dots(x_n-x_{n-1})}f(x_n)
\end{align*}
$$

### General Quadrature formula
$$
\begin{align*}
    I &=\int_{a=x_0}^{b=x_0+nh}f(x)dx\\
	
    &= h[ny_0+\frac{n^2}{2}\Delta y_0+(\frac{n^3}{3}-\frac{n^2}{2})\frac{\Delta^2y_0}{2!}+(\frac{n^4}{4}-n^3-n^2)\frac{\Delta^3y_0}{3!}\\
	
    &+ \dots+upto\ (n+1)\ terms]
\end{align*}
$$

### Trapezoidal Rule
$$
\int_{x_0}^{x_0+nh}f(x)dx = h[(\frac{y_0+y_n}{2})+(y_1+y_2+y_3+\dots+y_{n-1})]
$$

### Simpson's 1/3rd Rule
$$
\int_{x_0}^{x_0+nh} f(x)dx = \frac{h}{3}(y_0+y_n)+4(y_1+y_3+\dots+y_{n-1})+2(y_2+y_4+\dots+y_{n-2})
$$

### Simpson's 3/8th Rule
$$
\begin{align*}
    \int_{x_0}^{x_0+nh}f(x)dx=\frac{3h}{8}[(y_0+y_n) &+ 3(y_1+y_2+y_4+y_5+\dots+y_{n-1})\\

    &+ 2(y_3+y_6+\dots+y_{n-3})]
\end{align*}
$$