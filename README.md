[![Latest Release](https://img.shields.io/github/v/tag/chanjungkim/rive-compose)](https://github.com/chanjungkim/rive-compose/releases)

## How to

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.chanjungkim:rive-compose:0.1.0'
	}


Sample:

```!=kotlin
@Composable
fun Greeting(name: String) {
    Column {
        RiveAnimation(
            R.raw.demo,
            modifier = Modifier
                .height(300.dp)
                .width(200.dp)
        )
        Text(text = "Hello $name!")
    }
}
```
