# H2 example

The H2 example is a minimal plugin, adding support for H2 to KeyDeveloper. This sample acts as a starting 
point for your own dialect plugins.

> Change the paths below according to your installation

## Building

Clone this repository and import the *src* directory into your favorite Java IDE. 

IntelliJ IDEA, Eclipse and Netbeans all works fine. You can obviously use any suitable build tool as well, such
as Gradle, Maven and Ant.

Add a reference to all the JAR files in *C:\Program Files\KeyDeveloper\lib* and build the project.

## Install the config file

Copy *config/dialect.h2.config* to *C:\Users\youruser\KeyDeveloper\config*

This makes KeyDeveloper aware of the new dialect plugin.

## Running KeyDeveloper from your project

* Create a Run configuration with main class *com.keydeveloper.gui.Application*
* Set the working directory to *C:\Program Files\KeyDeveloper*

## Debugging

Create a Debug configuration just like the Run configuration. You can now set breakpoints
in the dialect code.

## Deploying your plugin

Create a JAR file from your project and copy it to *C:\Program Files\KeyDeveloper\lib*.

As mentioned above, the config file must be copied to your user directory as well.

You can now start KeyDeveloper from the Start menu and use your plugin.

## Using the plugin

After deploying the plugin, you can create new models using the H2 dialect. When editing
tables on an H2 model, only the relevant data types will be available.
