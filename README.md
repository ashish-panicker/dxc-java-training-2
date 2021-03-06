# Java training

## Dev Environment Setup

### Git

[Download Git](https://git-scm.com/downloads)

### Java

Java version `11` is used to develop the demos. You need to have Java `1.8` or above to use these demos without any trouble.

[Download JDK 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)

Setup **JAVA_HOME**
- Install JDK 11 into your system.
- Copy the installed JDK path.
- Create a new environment variable **JAVA_HOME** and set it to the installed JDK path.
- Update the PATH variable by adding the path to the JDK bin folder.
- Set JAVA_HOME in windows via command prompt.
    ```bash
    # The setx command permanently updates the environment variables.

    setx JAVA_HOME "C:\Program Files\Java\jdk-11.0.2" # assuming JDK 11 is installed in C:\Program Files\Java\jdk-11.0.2
    setx PATH "%PATH%;%JAVA_HOME%\bin"; # add the path to the JDK bin folder

    # You can use the -m switch along with setx command if you are trying to the set the enviroment varibles for whole system. 
    # This require administratir privileages.

    setx -m JAVA_HOME "C:\Program Files\Java\jdk-11.0.2" # assuming JDK 11 is installed in C:\Program Files\Java\jdk-11.0.2
    setx -m PATH "%PATH%;%JAVA_HOME%\bin"; # add the path to the JDK bin folder
    ```
- Check this [tutorial](https://youtu.be/nNKMplW-Tmw) if you are having trouble.
- To verify the JAVA_HOME variable is properly set, run the following command.
    ```bash
    java -version
    javac -version
    ```

### Maven

We are using maven to build our java applications. Maven version `3.8` is used, minimum required version is `3.6.3`.

[Download Maven](https://dlcdn.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.zip)

Setup **MAVEN_HOME**
- Install Maven into your system.
- Set MAVEN_HOME in windows via command prompt.
    ```bash
    setx MAVEN_HOME "C:\Apache\apache-maven-3.8.2" # assuming Maven 3.8.2 is installed in C:\Apache\apache-maven-3.8.2
    setx PATH "%PATH%;%MAVEN_HOME%\bin"; # add the path to the Maven bin folder
    ```
- To verify the MAVEN_HOME variable is properly set, run the following command.
    ```bash
    mvn -version
    ```

### Node JS

[Download Node JS](https://nodejs.org/en/download/)

Once downloaded installation is straight forward.

### IDE - VS Code

[Download VS Code](https://code.visualstudio.com/download)

Setup **VS Code** for Java development
- Install VS Code into your system.
- Install the following plugins into VS Code.
  - [Extention Pack For Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack)
- [Getting Started with Java in VS Code](https://code.visualstudio.com/docs/java/java-tutorial) follow this link to know more.

Setup **VS Code** for NodeJS/Javascript development.

Plugins
- [Prettier Code Formatter](https://marketplace.visualstudio.com/items?itemName=esbenp.prettier-vscode)
- [Visual Studio Intellicode](https://marketplace.visualstudio.com/items?itemName=VisualStudioExptTeam.vscodeintellicode)
- [NodeJS Extention Pack](https://marketplace.visualstudio.com/items?itemName=waderyan.nodejs-extension-pack)

### Getting ready for Angular development

We need to install `typescript` and `angular-cli` via node package manager `npm`.
```bash
# install typescript globally in the system.
npm install -g typescript 

# install angular-cli so that we can creating and scaffolding an angular application is much easier.
npm install -g @angular/cli
```

### Additional references

- [VSCode Typescript Support](https://code.visualstudio.com/docs/typescript/typescript-compiling)
- [VSCode JavaScript/NodeJS support](https://code.visualstudio.com/docs/nodejs/working-with-javascript)
- [VSCode Java Support](https://code.visualstudio.com/docs/languages/java)
- [Angular cli](https://angular.io/cli)


## Assignments

All the assignments that are allocated in the training session will be udated here.

```
- Assignments must be uploaded to your perosnal git repositories.
- The git repository must have the following name java-training
```

### Assignment 1

Create a Java programe that will perform the basic arithmetic operations.

```
Conditions:
- The program should adhere to java naming conventions.
- Each operation should be perfrmed in a seperate method.
- The file must be saved as Assignment1.java and under the java folder.
```

### Assignment 2

Create a Java program that will find the largest of three numbers.

```
Conditions:
- The program should adhere to java naming conventions.
- Each operation should be perfrmed in a seperate method.
- The file must be saved as Assignment2.java and under the java folder.
```

### Assignment 3 - EncapsulationDemo

Create a Java program that has the following three classess. 
- All the attributes must be encapsulated. 
- The classes must have a constructor that initializes the attributes. 
- The classes must have a zero argument constructor.
- A batch must have at least three students.

```java

class Student{

    String name;
    int age;
    String email;
    String address;
}

class Teacher {
    
    String name;
    int age;
    String email;
    String address;
}

class Batch{

    String name;
    int size;
    Student[] students;
    Teacher teacher;
}

public class EncapsulationDemo{

    public static void main(String[] args){

    }
}
```

### Assignment 4 - ArraySort

Create a java program with a method called `sort`. 
- The mothod should accept a integer array.
- It should then sort the array.
- Once sorted the array must be retunred to the calling method.


### Assignment 5 - ArrayLargest

Create a java program with a method call `largestInArray`.
- The mothod should accept a integer array.
- It shoudl then find the largest number in the array.
- The it shoudl return the number back to the calling method.


### Assignment 6 - OrderProcessing

Create a java program with the following features.

- This will be a menu driven program with `3` options.
  
  ```
  1. Process an order
  2. View all orders
  3. Exit
  ```
- Oprion 1 would ask the users to provide the item details. Once an item is entered a promt will ask the user if they want to add another item. If answer is `Y` then the user will be prompted to enter the item details.
- The program must have a class called `OrderProcessing`.
- The program will have a class called `Order` for repreenting the order.
- Order class will have the following attributes.
  
  ```
  Order Id
  Customer Name
  Item List
  Net Price
  ```

- The program will have a class called `Item` for repreenting the items in the order.
- Item class will have the following attributes

    ```
    Item Code
    Item Name
    Unit Price
    Quantity
    Total Price 
    ```
  

- The order and item detaisl must be collected from the user.
- The order id must be uniquely generated.
- Once the items are completely entered the order must be processed and it must printed into the screen.
- Once the order is processed the order must be saved into a file.
- The file must be created inside the `orders` folder.
- The file name must be int the following format `order-#order_id`.
- Orders must be printed in a tabular format
```
--------------------------------------------------------------------------
 Order Id:  1                                   Customer:    Ashish         
 
 Item Name             Qty     Unit Price     Total Price
 --------------------------------------------------------------------------
  Book - Animal Farm    1       72.99           72.99 
         Soap - Dove    2       44.99           89.98 
 Noodles - Spaghetti    3       23.99           71.97 
  Softdrinks - Pepsi    3       33.99           101.97 
        Flour - Atta    1       23.99           23.99 
---------------------------------------------------------------------------
 Net Total: 199.95 

```
- Option 2 will generate an output in the following format.
  
    ```
    Order Id          File name           Modified date
    -----------------------------------------------------------------------
    1                order-1              2020-01-01 12:00:00
    2                order-2              2020-01-02 12:00:00
    -----------------------------------------------------------------------

    Enter the order number you want to view

    ```
    