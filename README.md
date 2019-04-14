# Food &amp; Health Application

## Configuration - Parse Server

### Food-Health-Application/app/src/main/java/com/example/foodhealthapp/ParseServer.java

#### Locally
```
.applicationId("YOUR_APP_ID")
.clientKey("YOUR_CLIENT_KEY")
.server("http://localhost:1337/parse/")
```

#### Cloud
```
.applicationId("YOUR_APP_ID")
.clientKey("YOUR_CLIENT_KEY")
.server("http://cloudhost:80/parse/")
```

## Configuration - Google Maps API
### Food-Health-Application/app/src/debug/res/values/google_maps_api.xml

```
<string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">YOUR_KEY_HERE</string>
```

## Configuration - Marker API
### Food-Health-Application/app/src/main/java/com/example/foodhealthapp/MarkerTask.java
```
private static final String SERVICE_URL = "YOUR_URL_HERE";
```
