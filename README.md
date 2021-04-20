# HomeToast
Dynamic view for toast

[![API](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=23) 
[![](https://jitpack.io/v/hojjatmehri/HomeToast.svg)](https://jitpack.io/#hojjatmehri/HomeToast)


With this library, you can create a complete custom notification with beautiful view. there is five default notification view (Simple, Success, Error, Warning and Information) but you can change all details like background, text color, icon image and etc.


Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

# Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	implementation 'com.github.hojjatmehri:HomeToast:1.0.1'
}
```
## Screenshots

**Please click the image below to enlarge.**

<img src="https://camo.githubusercontent.com/c17d88bb74139e0fa48f226afe3a5f6f68768fbc8ba2562d329ad14e56219985/68747470733a2f2f73332e67696679752e636f6d2f696d616765732f686f6d65546f6173742e676966">

## Usage

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

To display an error Toast:

``` java
HomeToast.showError(yourContext,"Here is some info for you.");
```
To display a success Toast:

``` java
HomeToast.showSuccess(yourContext,"Here is some info for you.");
```
To display an info Toast:

``` java
HomeToast.showInformation(this,"Here is some info for you.");
```
To display a warning Toast:

``` java
HomeToast.showWarning(yourContext,"Here is some info for you.");
```
To display the usual Toast:

``` java
HomeToast.show(yourContext,"Here is some info for you.");
```

