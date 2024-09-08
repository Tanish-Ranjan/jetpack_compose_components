# Jetpack Compose Components 🎨

A curated collection of reusable and customizable Jetpack Compose components to accelerate your Android UI development.

## ✨ Features

* **Beautiful and Versatile:**  Provides a range of pre-styled composables to enhance your app's visual appeal.
* **Easy Integration:**  Seamlessly integrate these components into your existing Jetpack Compose projects.
* **Theming Support:**  Customize the appearance of components to match your app's design system.
* **Open for Contributions:**  We welcome contributions from the community to expand and improve this toolkit!

## 🚀 Getting Started

1. **Add the JitPack repository to your root build.gradle file:**
    <details open>
    <summary>Kotlin DSL</summary>
   
    ```gradle
    dependencyResolutionManagement {
        ...
        repositories {
            ...
            maven { setUrl("https://jitpack.io") }
        }
    }
    ```
   
    </details>
   
    <details>
    <summary>Groovy DSL</summary>
   
    ```gradle
    dependencyResolutionManagement {
        ...
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
    ```
   
    </details>
   
2. **Add the dependency:**
    <details open>
    <summary>Kotlin DSL</summary>
   
    ```gradle
    dependencies {
        implementation("com.github.Tanish-Ranjan:jetpack_compose_components:version")
    }
    ```
   
    </details>
   
    <details>
    <summary>Groovy DSL</summary>
   
    ```gradle
    dependencies {
        implementation 'com.github.Tanish-Ranjan:jetpack_compose_components:version'
    }
    ```
   
    </details>

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

Browse through a huge collection of all the components this library provides in [components page](./docs/README.md).

## 🤝 Contributing

We welcome contributions! Please check out our [CONTRIBUTING.md](CONTRIBUTING.md) guide for details on how to get involved.

## 📄 License

This project is licensed under the [MIT License](LICENSE).