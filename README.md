# Series of labs on discipline 'Software Development' using object oriented language Java.

# For compiling project use:
# $ javac -d bin -sourcepath src -classpath /Users/elharo/classes:/Users/elharo/lib/junit.jar src/com/elharo/gui/MainFrame.java
# javac -d /Users/alekseydruzik/InteliJIdeaProjects/BNTU/ObjectOrientedProgramming/out -sourcepath /Users/alekseydruzik/InteliJIdeaProjects/BNTU/ObjectOrientedProgramming -classpath /Users/alekseydruzik/InteliJIdeaProjects/BNTU/ObjectOrientedProgramming/src/resources/jars/log4j-1.2.17.jar /Users/alekseydruzik/InteliJIdeaProjects/BNTU/ObjectOrientedProgramming/src/by/bntu/fitr/povt/alexeyd/lab18/Log.java

# For running use:
# java -classpath bin:/Users/elharo/classes:/Users/elharo/lib/junit.jar com.elharo.gui.MainFrame
# java -cp /Users/alekseydruzik/InteliJIdeaProjects/BNTU/ObjectOrientedProgramming/src/resources/jars/log4j-1.2.17.jar:/Users/alekseydruzik/InteliJIdeaProjects/BNTU/ObjectOrientedProgramming/out/ by.bntu.fitr.povt.alexeyd.lab18.Logjava -classpath /Users/alekseydruzik/InteliJIdeaProjects/BNTU/ObjectOrientedProgramming/src/resources/jars/log4j-1.2.17.jar:/Users/alekseydruzik/InteliJIdeaProjects/BNTU/ObjectOrientedProgramming/out/ by.bntu.fitr.povt.alexeyd.lab18.Log

# Creating jar:
# jar cmf META-INF/MANIFEST.MF lab.jar by/bntu/fitr/povt/alexeyd/lab1/Main.class
# Compile project to ObjectOrientedProgramming/out:
# javac -d /Users/alekseydruzik/InteliJIdeaProjects/BNTU/HibernateLessonsBasicLevel/out/ -classpath "/Users/alekseydruzik/InteliJIdeaProjects/BNTU/HibernateLessonsBasicLevel/src/resources/jars/*" -sourcepath /Users/alekseydruzik/InteliJIdeaProjects/BNTU/HibernateLessonsBasicLevel/src/ /Users/alekseydruzik/InteliJIdeaProjects/BNTU/HibernateLessonsBasicLevel/src/by/bntu/fitr/povt/task18/Main.java
# javac -d E:\Bntu\java\myLabs\ObjectOrientedProgramming\out -sourcepath E:\Bntu\java\myLabs\ObjectOrientedProgramming\src E:\Bntu\java\myLabs\ObjectOrientedProgramming\src\by\bntu\fitr\povt\alexeyd\lab09\Lab09TaskE.java
# javac -d E:\IdeadProjects\helloWorldProj\Hibernate-lessons-basic-level\out -sourcepath E:\IdeadProjects\helloWorldProj\Hibernate-lessons-basic-level\src -classpath "E:\IdeadProjects\helloWorldProj\Hibernate-lessons-basic-level\src\resources\jars\*" E:\IdeadProjects\helloWorldProj\Hibernate-lessons-basic-level\src\by\bntu\fitr\povt\task18\Main.java

# cd ObjectOrientedProgramming/out
# jar cmf ../MANIFEST.MF lab09TaskE.jar by/bntu/fitr/povt/alexeyd/lab09/
# For adding resources to jar, just copy manually your resource-folder to out-folder and add resources/ :
# jar cmf ../MANIFEST.MF myJdbcApp.jar by/bntu/fitr/povt/task18/ resources/

# Running jar:
# java -jar lab.jar

# Useful links:
# 1. https://www.mkyong.com/logging/log4j-log4j-properties-examples/
# 2. For naming commits use - https://www.conventionalcommits.org/en/v1.0.0-beta.3/
# 3. Information about XSD validation - https://www.tutorialspoint.com/xsd/xsd_validation.htm
# 4. Creating jar - https://docs.oracle.com/javase/tutorial/deployment/jar/defman.html
# 5. Creating jar - https://introcs.cs.princeton.edu/java/85application/jar/jar.html