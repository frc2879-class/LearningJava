## LearningJava

[![Join the chat at https://gitter.im/frc2879-class/LearningJava](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/frc2879-class/LearningJava?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Code lessons for learning Java, with an emphasis on the FIRST Robotics Competition class hierarchy.

This repository is intended to hold lessons and code skeletons for FRC team 2879 members to learn the Java 
programming language.  There will be an emphasis on using the FRC Java class libraries to control a robot.

This repository will also hold lessons and code skeletons for other related tools that we use in building and
programming our robots.

The wiki link (the book-like icon to the right) has more information on the lessons.  [Or, click here to jump to the main wiki page.]
(../../wiki/)

#### For Linux Users
I've run into problems running Eclipse on my laptop with Ubuntu.  I found a few settings that help improve the experience.  I have a shell script that I use to run Eclipse that looks like this:

> eclipse -vmargs -Xmx2048M -XX:MaxPermSize=256M

The `-vmargs` switch tells eclipse that the switches that follow it are to be passed to the Java Virtual Machine.  The `-Xmx2048M` switch tells the JVM to use 2048 MB (or 2 GB) of the 4 GB system RAM on my computer.  

The `-XX:MaxPermSize=256M` switch is a little more complicated to explain.  In a nutshell, the JVM divides up memory into regions based on how frequently memory is used.  There's a region of memory that's always used and this switch sets aside 256 MB of memory for that region.

There's also an `eclipse.ini` file that stores these settings (and more) in the directory where you installed the Eclipse files.  Modifying that file to use the above settings will also work.
