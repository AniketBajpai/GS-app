# GS-app
App to convert printed materials to speech

 
// add few photos showing showing text here

Size of font : Fonts of all reasonable sizes can be detected by changing the distance of camera from the text, until the text fills the box almost completely. This can be done by approximately placing the center of the camera near the printed text. (The app will work if the text occupies most of the box, and the camera is able to focus on it)
Distance from Printed Text : This is dependent on several factors, including the size of the text to be read (directly proportional ), the camera specification etc. The optimum distance for the app to work is such that the text to be read completely fits inside the box specified in the center of the screen .
Response time : Less than 4 seconds
Ideal Cases of Usage: It works ideally with linear text – one sentence, which approximately fits in the central part of the screen. It shows better performance during the day (due to low intensity variation in photos captured by the camera)
Size of app: 10 MB
Expected Cost : nil
Visual Accessability : very easy for a blind to use . Just requires a one time installation under a Guide . After that App is self sufficient to interact with Blind
 
Changes from IDEATION phase:
The app does not use local thresholding, so it performs poorly if there is large intensity variation in photo. Global thresholding is implemented but not activated.
Autocorrect on recognized text is implemented but not activated due to bugs. Hence, sometimes, the spoken text is not meaningful.
Deskewing was implemented but not included in the app. Hence the app now reads only approximately linear text.
Output in multiple languages is implemented, and supported by the app. However, we have permanently set the output language to English, with no mechanism to change it from the frontend of the app . This was done to increase simplicity of operation of the app.
 
 
The App is expected to work on Android mobile phones with a minimum SDK version of 15 .
The testing of the app was done only on SDK versions 21, 22, and 23. (The above results can be assured only for these SDK versions)
Testing of the app was done on Motorola G2, Samsung J2, and Xiaomi Mi4i.


 
 
 
 
 
User Guide
 
After installation, on the first start, the app provides the basic instructions to use it (in speech as well as text). After that it downloads mandatory data for its usage (Note: without this, the app will not work). It is advisable to use WiFi for download this data. Once the data is downloaded, the app is ready to use, and can be run without a network (or any) connection after this first installation. The app also requires permission to use the phone’s camera (which is essential, and does not violate the user’s privacy). This should be provided during the first installation.
 
The app works on a single touch of (any part of) the screen. If the text is present inside the box, it is detected within a few seconds (<4s). At every touch, there is a beep sound which alerts the user to wait for the result. The user should not touch the screen subsequently, and wait for the result. If the text is properly detected, then it is spoken out within a few seconds (spoken text is not completely accurate). The output is meaningful only if the text scanned is meaningful. In case of a failure to detect text, the app responds with the message “Please Try Again”.
 

