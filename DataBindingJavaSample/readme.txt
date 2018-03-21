This example demonstrates the usage of the List & Label .NET component (https://www.combit.net/en/reporting-tool) in Java with the third party component Javonet (https://www.javonet.com). This is a strongly typed wrapper for the combit List & Label .NET component. It exposes only the key operations required for this sample:
 
- using a List & Label .NET Dataprovider to connect to an Access database with OleDB and respond to an event of the Dataprovider
- calling/opening the List & Label Designer; including real data preview
- printing into the List & Label preview control on the form and respond to a preview control button click event
- exporting into any of the supported List & Label export formats
 
You can further extend this class to expose the strongly typed methods with signatures matching the combit List & Label .NET component (see also the .NET help at https://docu.combit.net/en) and forwarding the calls via Javonet. To learn more how to perform different types of calls from Java to .NET API using Javonet, go to Javonet Guides for Java developers (https://www.javonet.com/java-devs/guides/).

Requirements:
You need to copy the .NET assembly combit.ListLabel23.dll into the sample folder. Also, make sure to get the latest Javonet JAR package for Java developers and trial or commercial license key from Javonet. To get the sample working, add your licensing information for activating Javonet in combit.ListLabel23.JavonetActivation.InitializeJavonet. You can register for Javonet free trial and access download page by registering here (https://my.javonet.com/signup/?type=free).
