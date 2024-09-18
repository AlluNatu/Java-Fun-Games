# Week 1
1) Install a functional Java development environment (including JDK and IDE – for example, JDK for Windows and Visual Studio Code).
2) Familiarize yourself with the IDE and create a new project.
3) Write a Java program that prints "Hello World!" to the screen.

# Week 2
Here’s the translation:

---

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


# Week 3
Here’s the translation:

---

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

  # Week 4

  Here's the translation:

---

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

  # Week 5
