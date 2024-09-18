# Assingment descriptions
  ## Week 1
1) Install a functional Java development environment (including JDK and IDE – for example, JDK for Windows and Visual Studio Code).
2) Familiarize yourself with the IDE and create a new project.
3) Write a Java program that prints "Hello World!" to the screen.

## Week 2

**Write a program where you create a hedgehog object and control it through a menu structure. You will need an `App.java` file similar to the one from the first week. This file should contain the main method with the menu structure. Additionally, you need a `Hedgehog.java` file, which defines the `Hedgehog` class.**

**2 points (You will directly receive 2 points for this step)**

- The class should define a default constructor, which initializes the hedgehog with a name and age (`String name, int age`). By default, these are "Pikseli" and 5. Additionally, the hedgehog should be able to speak. This is handled by the `speak` method. The method takes a `String` parameter and prints out the text `"<hedgehog's name>: <text>"`. At the beginning of the program, create a default hedgehog that is immediately available.

**3 points**

- Add the ability to set a new name and age for the hedgehog. Practically, this means creating a new hedgehog and calling a constructor that takes name and age as parameters.

- The menu should display "Input was incorrect" if the user provides a number that is not specified.

**4 points**

- The hedgehog should also be able to run, so add a `run` method to the class that takes an integer parameter and prints the text `"<hedgehog's name> runs at high speed!"` that many times. The menu should ask how many times the hedgehog will run.

**5 points**

- If the hedgehog is given an empty input to speak, it should state its name and ask for new input: `"I am <hedgehog's name> and my age is <hedgehog's age>, but could you still provide input?"`

      ***Example run***
      
      1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
      1
      Mitä siili sanoo:
      Moikka!
      Pikseli: Moikka!
      1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
      3
      Kuinka monta kierrosta?
      2
      Pikseli juoksee kovaa vauhtia!
      Pikseli juoksee kovaa vauhtia!
      1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
      4
      Syöte oli väärä
      1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
      2
      Anna siilin nimi:
      Tekseli
      Anna siilin ikä:
      3
      1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
      1
      Mitä siili sanoo:
      
      Olen Tekseli ja ikäni on 3 vuotta, mutta antaisitko silti syötteen?
      1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
      3
      Kuinka monta kierrosta?
      1
      Tekseli juoksee kovaa vauhtia!
      1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
      0
      Kiitos ohjelman käytöstä.
      
      ***Example run ends***


## Week 3

**In this week’s exercises, you will build a zoo. You will need an `App.java` file with a menu and additionally `Zoo` and `Animal` classes.**

- Through the menu, you can create new animals. The `Animal` class constructor takes parameters for the animal’s species, name, and age. The first two are strings and the last one is an integer. The newly created animal object is then given to the zoo object, which stores the animal in an `ArrayList` (which is very useful here).

- Through the menu, you can command the zoo object, which has methods `addAnimal`, `listAnimals`, and `runAnimals`. `listAnimals` prints each animal’s details on a separate line (a `for(each)` loop is useful here), and `runAnimals` makes each animal run for the number of rounds specified by the user. Animals are run in the order they were added to the `ArrayList`.

**1 point**

- The program asks for the name of the zoo at the start.

**3 points**

- Adding animals to the zoo is possible. You can also list all the animals in the zoo.

**5 points**

- Animals can be made to run, and the program should indicate if the user selects an unknown input from the menu.

          *** Esimerkkiajo ***
      
      Anna eläintarhalle nimi:
      Korkeasaari
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      1
      Mikä laji?
      Siili
      Anna eläimen nimi:
      Pikseli
      Anna eläimen ikä:
      5
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      1
      Mikä laji?
      Possu
      Anna eläimen nimi:
      Pipsa
      Anna eläimen ikä:
      5
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      1
      Mikä laji?
      Ryhmä Hau
      Anna eläimen nimi:
      Rolle
      Anna eläimen ikä:
      3
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      2
      Korkeasaari pitää sisällään seuraavat eläimet:
      Siili: Pikseli, 5 vuotta
      Possu: Pipsa, 5 vuotta
      Ryhmä Hau: Rolle, 3 vuotta
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      3
      Kuinka monta kierrosta?
      2
      Pikseli juoksee kovaa vauhtia!
      Pikseli juoksee kovaa vauhtia!
      Pipsa juoksee kovaa vauhtia!
      Pipsa juoksee kovaa vauhtia!
      Rolle juoksee kovaa vauhtia!
      Rolle juoksee kovaa vauhtia!
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      4
      Syöte oli väärä
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      1
      Mikä laji?
      Hämähäkki
      Anna eläimen nimi:
      Mies
      Anna eläimen ikä:
      32
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      2
      Korkeasaari pitää sisällään seuraavat eläimet:
      Siili: Pikseli, 5 vuotta
      Possu: Pipsa, 5 vuotta
      Ryhmä Hau: Rolle, 3 vuotta
      Hämähäkki: Mies, 32 vuotta
      1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
      0
      Kiitos ohjelman käytöstä.
      
      *** Esimerkkiajo päättyy ***

  ## Week 4

**In this week’s exercises, you will build a calculator class that can calculate course grades for students. You will need an `App.java` file with a menu and additionally `Calculator`, `University`, and `Student` classes. You might also need a `Grade` class depending on your implementation.**

- The purpose of the program is to input course grades for students (Course name and number – `HashMap` is a functional data structure, but `ArrayList` + `Grade` class is also quite functional and much easier to extend. Use the latter if `HashMap` is unfamiliar). The program can contain 0-N students, and each student can have 0-N course grades.

- The calculator program should be able to calculate the average and median grades from the course grades. Additionally, it should be able to print all students' grades to the screen as shown in the example execution.

- The program also has functionality for saving data to a file and reading data from a file. This means the `University` class is responsible for writing the `students` data structure to a file. The object contains all the data, so this data must be written to the file automatically. The `Student` class must be serializable – as well as the `Grade` class if used.

**The `Calculator` class should have the following functionalities:**

- `getAverageGrade(Student s)` – returns the average of course grades as a `double`. If there are no grades, return zero.

- `getMedianGrade(Student s)` – returns the median grade as a `double`. This is easiest by sorting the data structure in ascending order and returning the middle element (sort a copy of the data structure to avoid changing the original structure – a regular `Array` is functional here). If there is an even number of elements, return the average of the two middle elements. If there are no grades, return zero.

**The `Student` class should have the following functionality:**

- `addGrade(String course, int grade)` – stores a course grade in the list.

**1 point**

- The program should allow adding new students and listing them.

**2 points**

- The program should allow adding grades for selected students.

**3 points**

- The program should be able to save the entered data to a file and read inputs from it.

**4 points**

- The program should be able to calculate the average grade of a student.

**5 points**

- The program should be able to calculate the median grade of a student and print "Input was incorrect" if an invalid input is provided.

        *** Esimerkkiajo ***
      
      
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      1
      Anna opiskelijan nimi?
      Ville Virtanen
      Anna opiskelijan opiskelijanumero:
      0556677
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      1
      Anna opiskelijan nimi?
      Jane Doe
      Anna opiskelijan opiskelijanumero:
      0882256
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      2
      Opiskelijat:
      0556677: Ville Virtanen
      0882256: Jane Doe
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      3
      0: Ville Virtanen
      1: Jane Doe
      Mille opiskelijalle suorite lisätään?
      1
      Mille kurssille suorite lisätään?
      Olio-ohjelmointi
      Mikä arvosana kurssille lisätään?
      5
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      3
      0: Ville Virtanen
      1: Jane Doe
      Mille opiskelijalle suorite lisätään?
      1
      Mille kurssille suorite lisätään?
      Testikurssi
      Mikä arvosana kurssille lisätään?
      4
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      5
      0: Ville Virtanen
      1: Jane Doe
      Minkä opiskelijan suoritteiden keskiarvo lasketaan?
      1
      Keskiarvo on 4.5
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      4
      0: Ville Virtanen
      1: Jane Doe
      Minkä opiskelijan suoritteet listataan?
      1
      Olio-ohjelmointi: 5
      Testikurssi: 4
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      6
      0: Ville Virtanen
      1: Jane Doe
      Minkä opiskelijan suoritteiden mediaani lasketaan?
      1
      Mediaani on 4.5
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      3
      0: Ville Virtanen
      1: Jane Doe
      Mille opiskelijalle suorite lisätään?
      1
      Mille kurssille suorite lisätään?
      Fail
      Mikä arvosana kurssille lisätään?
      0
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      5
      0: Ville Virtanen
      1: Jane Doe
      Minkä opiskelijan suoritteiden keskiarvo lasketaan?
      1
      Keskiarvo on 3.0
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      6
      0: Ville Virtanen
      1: Jane Doe
      Minkä opiskelijan suoritteiden mediaani lasketaan?
      1
      Mediaani on 4.0
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      7
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      1
      Anna opiskelijan nimi?
      Pena Poistuva
      Anna opiskelijan opiskelijanumero:
      666
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      8
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      2
      Opiskelijat:
      0556677: Ville Virtanen
      0882256: Jane Doe
      1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
      0
      Kiitos ohjelman käytöstä.
      
      *** Esimerkkiajo päättyy ***

  ## Week 5

**This week, the goal is to practice inheritance. Your task is to create the `Vehicle`, `Car`, `Plane`, `Ship`, and `Engine` classes. The names listed above are mandatory and cannot be changed. All vehicles have an engine object. The engine has a name and power. For cars, the values are always "V8" and 300, for planes "Jet Engine" and 500, and for ships "Wärtsilä Super" and 1000.**

- The constructor of the `Vehicle` class takes parameters in the following order: `String type`, `String manufacturer`, `String model`, `int maxSpeed`. 
- The specific vehicles (Car, Plane, Ship) take the parameters: `String manufacturer`, `String model`, `int maxSpeed`.

**2 points**

- Testing begins by verifying that the `Car`, `Plane`, and `Ship` classes inherit from the `Vehicle` class.

**3 points**

- The second test checks that the methods `drive`, `fly`, and `sail` (method names must be exactly as stated) are found only in the subclasses, not in the base class; `drive` in the `Car` class, `fly` in the `Plane` class, and `sail` in the `Ship` class.

- The following tests will not be performed if the previous ones do not pass.

**4 points**

- The program should allow creating new cars, planes, and ships as shown in the example execution and listing their details. Store the objects in an `ArrayList<Vehicle>` data structure.

**5 points**

- The program should be able to drive, fly, or sail the created objects. You should be able to command all cars to drive, planes to fly, or ships to sail. Use the `instanceof` operator and type casting to move the correct objects.

            *** Esimerkkiajo ***
          
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          1
          Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva
          1
          Anna kulkuneuvon valmistaja:
          Volvo
          Anna kulkuneuvon malli:
          240
          Anna kulkuneuvon huippunopeus:
          180
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          1
          Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva
          1
          Anna kulkuneuvon valmistaja:
          Lada
          Anna kulkuneuvon malli:
          2105
          Anna kulkuneuvon huippunopeus:
          160
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          1
          Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva
          3
          Anna kulkuneuvon valmistaja:
          Rauman telakka
          Anna kulkuneuvon malli:
          Oasis of the seas
          Anna kulkuneuvon huippunopeus:
          40
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          1
          Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva
          2
          Anna kulkuneuvon valmistaja:
          Airbus
          Anna kulkuneuvon malli:
          727
          Anna kulkuneuvon huippunopeus:
          800
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          2
          Auto: Volvo 240
          Moottori: V8 300kW
          Huippunopeus: 180km/h
          
          Auto: Lada 2105
          Moottori: V8 300kW
          Huippunopeus: 160km/h
          
          Laiva: Rauman telakka Oasis of the seas
          Moottori: Wärtsilä Super 1000kW
          Huippunopeus: 40km/h
          
          Lentokone: Airbus 727
          Moottori: Suihkumoottori 500kW
          Huippunopeus: 800km/h
          
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          3
          Volvo 240 paahtaa tietä eteenpäin!
          Lada 2105 paahtaa tietä eteenpäin!
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          4
          Airbus 727 lentää kohteeseen!
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          5
          Rauman telakka Oasis of the seas seilaa merten ääriin!
          1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
          0
          Kiitos ohjelman käytöstä.
          
          *** Esimerkkiajo päättyy ***

  ## Week 7

**Week 7’s assignment is a bit more extensive than previous tasks, and you can earn 7 points instead of 5. These extra points will count towards the course evaluation, allowing you to make up for lost points or prepare for a rainy day.**

**The task is to build a study system similar to Sisu. Below is a class diagram for the system that needs to be implemented. In the main program (`App.java`), you will create an object from the `Gifu` class, which allows creating new courses, new students, and adding students to courses. Additionally, various listings can be performed.**

![main/pasted image 0.png](https://github.com/AlluNatu/Java-Fun-Games/blob/main/photos_for_description/pasted%20image%200.png?raw=true)

**A few notes about the program:**

- Although there is a maximum number of students for a course, this value is not used anywhere.

- `getCourse(int id)` and `getStudent(int id)` take the index of the course or student in the `ArrayList`, not the course ID (e.g., CT60A2411).

- When a student enrolls in a course, the default grade is -1. When the course is graded, this grade is updated to reflect the actual course grade.

- The `Gifu` class can be implemented to contain three `ArrayList`s: `courses`, `students`, and `enrollments`.

- Methods such as `getCourses()` return an `ArrayList` of the appropriate type. In the example case, the return type would be `ArrayList<Course>`.

- The `Enrollment` class contains the grade as well as references to the `Student` and `Course` objects. In practice, when an `Enrollment` object is created, it is given `Student` and `Course` objects as parameters.

- `getEnrollments` methods compare the contents of the `enrollments` `ArrayList` to check if, for example, a `Student` object passed as a parameter is present. You can perform this check directly, e.g., `if (enrollment.getStudent() == studentParameter)`.

- The `Student` class does not have any methods for printing anything. Printing is handled in the main program; the main program prints the contents of the `Student` class that implements the `getInformation` interface to the user as needed.

**1 point**

- The program should allow creating new courses and listing them.

**2 points**

- The program should allow creating new students and listing them.

**3 points**

- The class interfaces should function as defined in the class diagram. At this stage, test methods such as `addCourse`, `getCourse`, `listCourses`, `addStudent`, `getStudent`, and `listStudents`. From this point on, additional points will also test the corresponding interface.

**4 points**

- The program should allow adding a student to a course and listing the students enrolled in the course.

**5 points**

- The program should allow assigning grades to students in a course.

**6 points**

- The program should allow listing the grades received by a specific student.

**7 points**

- The program should allow listing all grades for all students across all courses.

## Week 8

**The goal for this week is to get the Android Studio development environment up and running and to build your first functional Android application.**

**The application itself is quite simple. It will have two fields where the user can input numbers, and then four buttons for performing addition, subtraction, multiplication, and division on these numbers. The result of the calculation should be displayed in a text field below the buttons. Note that performing calculations with integers is sufficient, but you can also make the calculator work with floating-point numbers if you prefer. The user interface might look something like the example image below. You can customize the colors, fonts, and shapes as you like.**

![Screenshot](https://github.com/AlluNatu/Java-Fun-Games/blob/main/photos_for_description/pasted%20image%201.png?raw=true)

**Points for the assignment are awarded as follows:**

**1 point**

- The application starts up and contains all the required user interface elements (i.e., buttons and input fields).

**3 points**

- The application can perform at least one calculation.

**5 points**

- The application functions as a fully operational four-function calculator.

## Week 9

**This week’s task is to build an Android application that allows registering users into the system and listing them. You will need a main activity, an activity for collecting user information, and a third activity for listing users. Additionally, you need a `User` class for user data and a `UserStorage` class to hold `User` objects. Make `UserStorage` a Singleton to make it easy to access. (Note that you do not need to implement the `removeUser` method.)**

![Screenshot](https://github.com/AlluNatu/Java-Fun-Games/blob/main/photos_for_description/pasted%20image%202.png?raw=true)
![Screenshot](https://github.com/AlluNatu/Java-Fun-Games/blob/main/photos_for_description/pasted%20image%203.png?raw=true)

**The second view lists the added users. You can implement the view in whichever way you think best.**

![Screenshot](https://github.com/AlluNatu/Java-Fun-Games/blob/main/photos_for_description/pasted%20image%204.png?raw=true)

**Points for the assignment are awarded as follows:**

**1 point**

- The application starts up and allows creating new users, which are saved in the `UserStorage` object.

**2 points**

- Users can see the contents of `UserStorage`. It is sufficient to print the information to the console.

**3 points**

- The contents of `UserStorage` can be viewed within the application. You can display all the information in a text field, for example.

**4 points**

- The contents of `UserStorage` are displayed in a stylish manner (subjective) using the `RecyclerView` component.

**5 points**

- When adding a user, the user can select an image. It is enough to choose an image from a pre-defined catalog (dropdown menu or radio buttons), or you can implement an option to upload an image. The image should also be visible in the user listing.

## Week 10

**Continue with the previous week’s program with additional features. Each new feature is worth one point, and you can implement whichever features you want.**

**1 point**

- The program automatically saves the user list every time a new user is added.

**1 point**

- The program automatically loads the user list every time the program starts.

**1 point**

- The program lists users alphabetically by surname (you must use `RecyclerView` for this – if you did this last week, you don’t need to do it again; just use the existing implementation).

**1 point**

- When adding a user, checkboxes are used to select all the qualifications that the user has already completed.

**1 point**

- When displaying user information, list all the qualifications that the user has completed (you must use `RecyclerView` for this – if you did this last week, you don’t need to do it again; just use the existing implementation).

## Week 11

**This week, we will create a simple to-do/shopping list application, which allows you to add, edit, and delete items.**

![Screenshot](https://github.com/AlluNatu/Java-Fun-Games/blob/main/photos_for_description/pasted%20image%205.png?raw=true)

**1 point**

- The application can add items.

**2 points**

- The application lists items on the screen using `RecyclerView`.

**3 points**

- The application can delete added items.

**4 points**

- The application can edit added items.

**5 points**

- The application allows choosing whether to display items in chronological or alphabetical order.

## Week 12

**This week, we will develop the to-do/shopping list application to use fragments for the user interface. The goal is to use separate fragments for listing items and for adding new items. Additionally, the application will have a section at the bottom that continuously shows items marked as "super important". Note that this week, you do not necessarily need to implement editing and deleting functionality.**

![Screenshot](https://github.com/AlluNatu/Java-Fun-Games/blob/main/photos_for_description/pasted%20image%206.png?raw=true)

**1 point**

- When adding a new item to the list, it can be marked as "super important".

**2 points**

- The application uses at least two fragments.

**3 points**

- The application contains only one `Activity`.

**4 points**

- The application uses a `TabLayout`.

**5 points**

- The application has a separate `Fragment` that displays items marked as "super important". 
