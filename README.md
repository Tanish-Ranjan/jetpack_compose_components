# Jetpack Compose Components 🎨

A curated collection of reusable and customizable Jetpack Compose components to accelerate your Android UI development.

## ✨ Features

* **Beautiful and Versatile:**  Provides a range of pre-styled composables to enhance your app's visual appeal.
* **Easy Integration:**  Seamlessly integrate these components into your existing Jetpack Compose projects.
* **Theming Support:**  Customize the appearance of components to match your app's design system.
* **Open for Contributions:**  We welcome contributions from the community to expand and improve this toolkit!

## 🚀 Getting Started

1. **Add the JitPack repository to your root build.gradle file:**
    ```gradle
    // Groovy DSL
    dependencyResolutionManagement {
        ...
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
    ```
    ```gradle
    // Kotlin DSL
    dependencyResolutionManagement {
        ...
        repositories {
            ...
            maven { setUrl("https://jitpack.io") }
        }
    }
    ```
   
2. **Add the dependency:**
    ```gradle
    // Groovy DSL
    dependencies {
        implementation 'com.github.Tanish-Ranjan:jetpack_compose_components:<version>'
    }
    ```
    ```gradle
    // Kotlin DSL
    dependencies {
        implementation("com.github.Tanish-Ranjan:jetpack_compose_components:<version>")
    }
    ```

3. **Use the Composable:**
    ```kotlin
    @Composable
    fun MyScreen() {
        // Example usage of a circular throbber
        CircularThrobber1(
            modifier = Modifier.size(100.dp),
            color = Color.Blue
        )
        
    }
    ```

## 📚 Components

### 1. Linear Throbbers

Simple and smooth progress indicators for linear actions.

| Preview | Component |
|---|---|
| <img src="images/img1.png" alt="Variant 1" height="100"/> | LinearThrobber1 |
| <img src="images/img2.png" alt="Variant 2" height="100"/> | LinearThrobber2 |

### 2. Circular Throbbers

Circular progress indicators for various use cases.

| Preview | Component |
|---|---|
| <img src="images/img3.png" alt="Variant 1" height="100"/> | CircularThrobber1 |
| <img src="images/img4.png" alt="Variant 2" height="100"/> | CircularThrobber2 |
| <img src="images/img5.png" alt="Variant 3" height="100"/> | CircularThrobber3 |
| <img src="images/img6.png" alt="Variant 4" height="100"/> | CircularThrobber4 |

### 3. Bottom Navigation Bars

Easy-to-use navigation bars for the bottom of your screen.

| Preview | Component |
|---|---|
| <img src="images/img7.jpg" alt="Variant 1" width="400"/> | BottomNavigationBar1 |
| <img src="images/img8.jpg" alt="Variant 2" width="400"/> | BottomNavigationBar2 |
| <img src="images/img9.jpg" alt="Variant 3" width="400"/> | BottomNavigationBar3 |
| <img src="images/img10.jpg" alt="Variant 4" width="400"/> | BottomNavigationBar4 |
| <img src="images/img11.jpg" alt="Variant 5" width="400"/> | BottomNavigationBar5 |

## 🤝 Contributing

We welcome contributions! Please check out our [CONTRIBUTING.md](CONTRIBUTING.md) guide for details on how to get involved.

## 📄 License

This project is licensed under the [MIT License](LICENSE).