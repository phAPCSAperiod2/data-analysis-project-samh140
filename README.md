[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22617058)
# AP CSA Mini‑Project: Data Analysis with Arrays & File Input
### Using CSV Files • Arrays of Objects • Algorithms • Data Ethics & Quality

---

## 📌 Project Overview
In this mini‑project, you will choose a dataset (CSV file), design a **custom class** to represent each row, read the dataset using the **Scanner** class, store all data as **objects** in an ArrayList or array, and answer a **guiding question** by analyzing the data.

This project reinforces:

- Arrays & ArrayLists  
- File input with `Scanner`  
- Class design (attributes, constructors, methods)  
- Algorithms (min, max, average, filtering)  
- Data quality & ethics  
- Documentation using **Javadoc**  
- Creating a **UML class diagram**  

By the end, you will produce insights and answer your original question using your program.

---

## 🎯 Your Task
You will:

1. **Choose a dataset** (teacher provided or public).  
2. **Write a guiding question** for your dataset.  
3. **Design a Java class** with ≥ 3 attributes.  
4. **Use `Scanner` to read a CSV file**, parse rows, and construct objects.  
5. **Store all objects** in an array or ArrayList.  
6. **Analyze the dataset** using algorithms you create.  
7. **Print insights** and answer your guiding question.  
8. **Document your code** with Javadoc.  
9. **Create a UML class diagram** representing your custom class.  

Optional stretch challenges are included at the bottom!

---

## 🧪 Example Questions You Might Ask
Your dataset might allow you to answer things like:

- *"Which Pokémon type has the highest average Attack?"*  
- *"Which U.S. state had the lowest obesity rate in 2020?"*  
- *"What country had the highest CO₂ emissions in 2000?"*  
- *"What is the average HP for Fire-type Pokémon?"*  

Think simple, clear, and answerable.

---

## 📁 Project Structure
Your repository should follow this structure:
```
/src
    Main.java
    YourClass.java
/data
    your_dataset.csv
README.md   ← this file
UML_Diagram.png (or UML_Diagram.pdf)
```

---

## 🧩 Step 1 — Choose Your Dataset

Dataset name: StateData2020-CDC-Census
Resource link: https://runestone.academy/ns/books/published/csawesome2/external/_static/datasets/StateData2020-CDC-Census.csv

**What this dataset contains (2–3 sentences):**  
The dataset contains information on each state in the United States in 2016.
It primarily collects data on firearm deaths, drug overdose deaths,
and the percentage of the uninsured.

---

## ❓ Step 2 — Write Your Guiding Question

Your guiding question should be something you can answer using your dataset.

**My guiding question:**
What state has the greatest number of deaths due to firearms?
What state has the lowest percentage of people without health insurance?
Which states have a death-to-drug-overdose rate greater than 35 in the United States?


Examples:

- "Which Pokémon has the highest HP?"  
- "What is the average life expectancy in this dataset?"  
- "Which state had the highest vaccination rate?"  

---

## 🧱 Step 3 — Design Your Class

You must create a class that represents **one row** of your dataset.

### ✔ Your class must include:

- **At least 3 private attributes**  
- **A constructor** that takes all attributes as parameters  
- **Getter methods** for attributes you plan to analyze  
- **`toString()`** for easy printing  
- Any additional analysis/helper methods as needed  

### ✏ Include your class diagram


---

## 📥 Step 4 — Read Your CSV File Using Scanner

In `Main.java`, you must:

- Create a `File` object  
- Use `Scanner` to read the file  
- Skip the header row (if needed)  
- Read each line  
- Split by commas using `.split(",")`  
- Trim whitespace  
- Parse numbers using `Integer.parseInt()` or `Double.parseDouble()`  
- Construct objects  
- Add them to an ArrayList or array  

### Column → Attribute Map

| Attribute Name | CSV Column Name | Column Index # | Notes |
|----------------|------------------|----------------|-------|
|      state     |         STATE    |        0       | String |
| nonInsuredpercentage| Non-insured percentage |   2  | double |
|totalFirearmDeaths| Firearm Deaths totals in 2016 | 4  | int |
|drugOverdoseDeathRate|Drug Overdose death rates per 100k population 2016|5 |double|

---

## 📊 Step 5 — Analyze Your Data

You must write **at least two algorithms** to analyze your dataset.

### Required: Choose 2 or more algorithms
- [ ] Minimum value of attribute  
- [ ] Maximum value of attribute  
- [ ] Average of attribute  
- [ ] Filter by category  
- [ ] Count items matching a condition  

**Algorithms I will implement:**

1. Compare the drug overdose death rate in each state with the value 25. Count how many states have a rate greater than 25.
2. Get the minimum percentage of non-insured in which state.
3. Get the maximum total of deaths by firearms, and which state.

Optional extras:  
- Sorting  
- Top/bottom N items  
- Grouping by category  
- Comparison between groups  

---

## 🧠 Step 6 — Insights & Answer to Your Question

After analyzing your objects, print:

- ✔ How many rows were loaded  
- ✔ Your algorithm results  
- ✔ A clear answer to your guiding question  

**My findings:**  
There was a total of 52 rows.
Some states do not have data. States without data
had the value of -1 in their place.

**My answer to the guiding question:** 
From my analysis of the data set, I discovered that Texas had the greatest
number of deaths due to gun violence. 3353 people were recorded to have died
because of firearms in 2016, showing how gun violence should be a major concern.
I also discovered that Massachusetts has the lowest percentage of people who are 
non-insured at 2.6%. From this, I can assume Massachusetts provides good insurance.
Finally, I discovered that the 5 different states in the United States have a drug
overdose death rate above 35 per 100,000 population. This is very, very concerning. I
did not realize how severe the situation was until I answered this question.

---

## 📝 Step 7 — Documentation Requirements

### ✔ Javadoc Comments
You MUST use Javadoc for:

- Every **class**  
- Every **method**  
- Every **parameter**  
- Every **return value**  

Example:
```java
/**
 * Returns the highest HP among all Pokémon.
 * @param list the ArrayList of Pokémon objects
 * @return highest HP value in the dataset
 */
public static int findMaxHP(ArrayList<Pokemon> list) {
    // implementation
}
```

### ✔ UML Class Diagram
Add a UML diagram showing:

- Class name
- Attributes
- Methods
- Visibility (private/public)

Save as `UML_Diagram.png` or `.pdf` in the repo.

<img width="719" height="598" alt="image" src="https://github.com/user-attachments/assets/05720eb5-6319-4f1e-988b-4ffd62f27115" />


---

## 🛡 Step 8 — Data Ethics & Quality Reflection
Write a short reflection (3–5 sentences):

- What data-quality issues did you find?
- Could your dataset be biased?
- How might incomplete or inaccurate data affect results?
- How trustworthy are your insights?

**My reflection:**  
A data-quality issue that I found is that some rows may be
missing information or not have information at all, which can become
a hinderance. For example, the state Puerto Rico did not have any recorded data
for several areas of the data set and was replaced by the value "-1". This
could lead to problems in the future. I do not believe my dataset can be
biased because they came from official and reliable sources such as the CDC.
In complete or inaccurate data can lead to unreliable results that may
pose a problem, like in this situation deaths to firearms, as insignificant
or not of concern. I believe my insights on how concern people should be about
gun violence, drug overdoses, and insurance is reasonable but not perfect as I
don't have statistics that differentiate what values are significant and what is not.

---

## ⭐ Optional Challenges (Not Required but Fun!)

### 🔹 User Input
Allow the user to choose:

- Which attribute to analyze
- Which category to filter
- What statistics they want to calculate

### 🔹 Additional Algorithms

- Sorting objects
- Multiple comparisons
- Generating summaries
- Exporting results to a file

### 🔹 Data Cleaning

- Skip rows with missing values
- Detect invalid entries
- Normalize units

---

## ✅ Submission Checklist

- [ ] Dataset selected
- [ ] Guiding question written
- [ ] Class created with ≥3 attributes
- [ ] File reading implemented
- [ ] ArrayList/array of objects created
- [ ] At least 2 analysis algorithms implemented
- [ ] Findings printed
- [ ] Javadoc comments added
- [ ] UML diagram included
- [ ] Reflection completed
- [ ] Code compiles & runs

---

Good luck, and have fun exploring your dataset! 🚀  
You're now doing real data analysis — just like professional software engineers.
