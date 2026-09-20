# Assignment 2 - Factory Method & Abstract Factory (Bicycle manufacturing)

## Clean Code Principles Applied

### 1. Validated Construction (Fail Fast)

- **Why:** We should never let an object be created in a broken or incomplete state. Checking for `null` right inside the constructor stops bugs immediately before they cause hidden crashes later

> **Before:**

```java
public BikeAssemblerClient(BikePartsFactory factory) {
    // if factory is null, it crashes later with "NullPointerException"
    this.frame = factory.createFrame();
}
```

> **After:**

```java
public BikeAssemblerClient(BikePartsFactory factory) {
    if (factory == null) {
        throw new IllegalArgumentException("BikePartsFactory cannot be null");
    }
    this.frame = factory.createFrame();
}
```

---

### 2. Meaningful, Intention-Revealing Names

- **Why:** Names should claerly tell anyone reading the code what the class does.

> **Before:**

```java
public class MBFactory implements PFactory {
    // unclear what "MB" or "P" stands for
}
```

> **After:**

```java
public class MountainBikePartsFactory implements BikePartsFactory {
    // clear, readable, and describes its exact role
}
```

---

### 3. No Magic Strings (Using Polymorphism Instead of if/else)

- **Why:** Typing raw text strings like `"Mountain"` inside `if` statements is risky because a simple tiny typo might lead to breaking the program. The solutio nwould be to let the factory and interfaces pick the right objects automatically.

> **Before:**

```java
public void buildBike(String type) {
    if (type.equals("Mountain")) { // magic string: easy to misspell
        MountainFrame frame = new MountainFrame();
        frame.weld();
    }
}
```

> **After:**

```java
public void buildBike() {
    // no strings needed, java automatically runs the correct weld() method
    frame.weld();
}
```

---

### 4. No Magic Numbers (clear parameter names)

> **Why:** Putting raw numbers directly into methods leaves developers guessing what unit of measurement is being used. Adding the unit to the parameter name makes it obvious.

> **Before:**

```java
public void inflate(int amount);

// 35 what? bars? PSI? Percentage?
frontTire.inflate(35);
```

> **After:**

```java
public void inflate(int pressureInPsi);

// it is obviously 35 PSI
frontTire.inflate(35);
```

---

### 5. Small, Focused Classes (Single Responsibility Principle)

- **Why:** Every class should do only one job. The factory classes only handle _creating_ the bike parts, while the assembler client only handles _putting them together_.

> **Before:**

```java
// one messy class doing WAY too many unrelated tasks
public class BicycleManager {
    public void makeTires() { ... }
    public void assembleBike() { ... }
    public void printReceipt() { ... }
}
```

> **After:**

```java
// separated into focused classes with one job each
public class MountainBikePartsFactory implements BikePartsFactory {
    // ONLY responsible for creating parts
}

public class BikeAssemblerClient {
    // ONLY responsible for assembling the bike
}
```
