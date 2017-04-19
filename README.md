# SquareCamera

[![Release](https://jitpack.io/v/jmeinke/SquareCamera.svg)](https://jitpack.io/#jmeinke/SquareCamera)

## Description
Android module that takes a square photo using the native Android Camera API. 

## Features
- Tap to focus
- Two fingers zooming
- Front & Back camera
- Flash mode (Saved when the user exits)
- Supports both portrait & landscape
- Runtime permission is supported for saving/viewing photos

## SDK Support
Support from SDK version 14 onwards

## Download
Add JitPack in your root build.gradle at the end of repositories:
```groovy
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency in your module build.gradle file:
```groovy
dependencies {
    compile 'com.github.jmeinke:SquareCamera:1.1.2'
}
```

## Example
See [MainActivity.java](demo/src/main/java/com/desmond/demo/MainActivity.java).

## Video Demo
Link: https://youtu.be/cSGFiP-gZYU

## License
```
The MIT License (MIT)

Copyright (c) 2015 Ng Yang Yi, Desmond, and many more

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```