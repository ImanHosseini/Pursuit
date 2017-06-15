# Pursuit <br /> <br />
![alt text](https://github.com/ImanHosseini/Pursuit/blob/master/pursuit.jpg)
There was this famous physics (kinematics) problem from when I studied for olympiad that there are N turtles arranged on 
a circle in equal angular displacement and each one follows the next one with velocity V, what would be their trajectory
 as a function of time? Its like what ants do, and it helps the trajectory to "smooth out" and its a cool example
 if flock AI. Then we had another question that there is a hunter chasing a prey which is going on a straight line, what
 would be the trajectory etc. <br /> <br /> <br />
 And these problems could be done analyticaly due to their symmetries, special initial conditions 
 and such. Back then I used to take these problems to whatever extreme generality I could(what if they are on a sphere? what if they are on 
 a general riemannian metric? what if they dont move with constant velocity? what if they cannot 
 arbitrarily change direction? what if there are obstructions in the environmetn? etc.) and asking the more general questions.
 I even had my little lemmas and theorems on them and I later studied some papers dedicated to the prey problem. <br />
 Something I would've liked back then was to be able to simulate my models and test my hypotheses. So now (years later) I've
 come up with this. Also this is good practice for Object-Oriented design and I've tried to do it the right way. <br /> <br /> <br />
 
 There is an abstract class Player which the classes Prey and Hunter extend. Player must implement how an agent would do the next move.
 You can code your behaviour into a new kind of Player and try it out.
