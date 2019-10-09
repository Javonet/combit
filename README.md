 # Javonet/combit
Sample projects showing how to use combit List &amp; Label .NET component from Java through strongly typed wrapped based on Javonet.

This example demonstrates the usage of the List & Label .NET component (https://www.combit.net/en/reporting-tool) in Java with 
the third party component Javonet (https://www.javonet.com) and strongly-typed wrapper. Source code includes sample Swing desktop application using the component and compiled wrapper. Strongly-typed wrapper replicates List & Label 25 .NET API for Java, currently it exposes only the key operations required for this sample:
 
- using a List & Label .NET Dataprovider to connect to an Access database with OleDB and respond to an event of the Dataprovider
- calling/opening the List & Label Designer; including real data preview
- printing into the List & Label preview control on the form and respond to a preview control button click event
- exporting into any of the supported List & Label export formats
 
You can further extend this wrapper to expose the strongly typed methods with signatures matching the combit List & Label .NET component (see also the .NET help at https://docu.combit.net/en) and forwarding the calls via Javonet. To learn more how to perform different types of calls from Java to .NET API using Javonet, go to Javonet Guides for Java developers (https://www.javonet.com/java-devs/guides/).

# Requirements
You need to copy the .NET assembly combit.ListLabel25.dll into the sample folder. Also, make sure to get the latest Javonet Jar package for Java developers and trial or commercial license key from Javonet. To get the sample working, add your licensing information for activating Javonet in [DataBindingJavaSample/src/Form1.java in main method]. You can register for Javonet free trial and access download page by registering here (https://my.javonet.com/signup/?type=free).

# How to Run the Sample Using Eclipse
In this section you will find step by step guide how to run this sample. 

1) **Clone this repository** - navigate with console window to the folder where you want to clone the repository and run the command below. Sample source code will be download to **combit** folder.
```
git clone https://github.com/Javonet/combit.git
```
2) Open **Eclipse IDE**.
> Because by default the source in the repository does not include Eclipse project files you need to create new workspace and import the project.
3) **Create Eclipse Workspace** in the **combit** folder created by git.
4) Right click on Project Explorer and choose **Import** next **General** > **Projects from Folder or Archive** and press **Next**.
5) Press **Directory...** and point to the **DataBindingJavaSample** within the **combit** folder. Project should be automatically detected. Press **Finish** to complete.
> Now your project is ready, you only need to add missing dependencies and set Javonet activation key.
6) Register for free trial Javonet key [Signup for Javonet](https://my.javonet.com/signup?type=free).
7) After registration is completed download **Javonet Jar** and copy to the Eclipse project.
8) Right click **Javonet Jar** in Eclipse Project Explorer and choose **Build Path** > **Add to Build Path**
9) Right click **combit.ListLabel25.jar** in Eclipse Project Explorer and choose **Build Path** > **Add to Build Path**
10) **Set your email and Javonet license key** in **DataBindingJavaSample/src/Form1.java** file:
```java
ListLabelActivation.setLicense(*****your-email-here*****, *****your-license-key-here*****);
```
11) Register for **combit List & Label .NET** free trial [Register for combit](https://www.combit.net/en/download-trial/).
12) Download and install **combit List & Label** components and copy **combit.ListLabel25.dll** to your Java project root folder.
> combit.ListLabel25.dll can be found in List & Label install directory by default **C:\Program Files (x86)\combit\LL25\Redistributable Files\combit.ListLabel25.dll**

Now you can run the sample.

# Screenshots
<img alt="combit List & Label Java Sample Main Window" title="combit List & Label Java Sample Main Window" src="https://github.com/Javonet/combit/blob/master/Screenshots/MainWindow.png?raw=true" width="400px" />
<img alt="combit List & Label Java Sample Designer" title="combit List & Label Java Sample Designer" src="https://github.com/Javonet/combit/blob/master/Screenshots/Designer.png?raw=true" width="400px" />
<img alt="combit List & Label Java Sample Preview" title="combit List & Label Java Sample Preview" src="https://github.com/Javonet/combit/blob/master/Screenshots/Preview.png?raw=true" width="400px" />

# Extending the wrapper
Wrapper project **combit.5** source code with ready to use Jar build script is in Wrapper folder
# Troubleshooting
#### After importing the project to Eclipse each package in "src" is marked with red cross
It means that your Eclipse build path references non existing JRE or you did not copied and included in build path the Javonet JAR file.

#### When running the sample I get an exception "com.javonet.api.NException: Loading library failed. Library with name 'combit.ListLabel25.dll' was not found in current directory 'combit\DataBindingJavaSample' and in GAC."
This means that the combit.ListLabel25.dll has not been placed in project root directory and cannot by resolved by Javonet.

#### When running the sample, I press "Design" button and get exception "com.javonet.api.NException: The 'Microsoft.Jet.OLEDB.4.0' provider is not registered on the local machine."
This exception means that List & Label components cannot find the OLEDB driver. It might mean that you did not install the List & Label components on your machine or you are using the x64 (64 bit) JRE. For this component to work you need to run the application using x86 (32 bit) JRE.

#### When running the sample in the List & Label designer window the toolbar is displayed as standard menu instead of Ribbon menu
Ribbon menu requires the ComCtl32.dll in version 6 to be loaded. Java by default when running the application using javaw.exe is loading version 5 which does not support ribbon framework. To get modern ribbon menu you need to run the sample using java.exe. To setup Eclipse for running the project with java.exe follow these steps:
1) Right click your project > **Choose Run As** > Select **Run Configurations** > Go to **JRE** tab
2) Select **Alternate JRE** and choose x86 JRE from the list
3) New section **Java executable** will appear below. Select there the **Alternate** option and type **java** instead of **javaw**
