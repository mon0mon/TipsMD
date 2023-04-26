# Useful Tips for Using Jetbrain User

## Editor

### 1. [Code Auto Compeletion Case Sensetive off](https://roytuts.com/how-to-remove-case-sensitive-from-auto-complete-search-in-intellijidea/)

    - Settings - Editor - General - Code Completion
    - Uncheck Match case

    <img src="Image/CodeComplete_CaseSenesitive_Off.png" width="1200px"></img>

### 2.[Show Virtual Space Option](https://youtrack.jetbrains.com/issue/VIM-2303)

- Settings - Editor - General - Virtual Space - Show virtual space at the bottom of the file
- If you using ideavim and ```zz``` command not work than try this option

<img src="Image/Trouble_ZZ_Ideavim.gif" width="1200px"></img>
> Last line doesn't properly center with `zz` command (option __OFF__)

<img src="Image/ZZ_Ideavim_Work.gif" width="1200px"></img>
> Now `zz` command properly center (option __ON__)

### 3. Font Ligatures off

- Sometimes some font do looks weired when type certin word. Like ==, !=, \ etc...
- To Fix this problem in Jetbrain's IDE you need to turn off the __Font Ligatures__ options.

  - Settings - Editor - Font - Enable ligatures __OFF__

> Enable ligatures

<img src="Image/Editor_FontLigatures_On.png">

> Disable ligatures

<img src="Image/Editor_FontLigatures_Off.png">

### 4. Variable Column Vertical Alignment

```
  int i = 0;
  int Count = 0;
  Node *List = NULL;
  Node *Current = NULL;
  Node *NewNode = NULL;
```

- You can align variable group vertical just by hitting align button (__Ctrl + Alt + L__)

> Intellij
- Settings - Editor - Code Style - Java - Wrapping and Braces - Group declarations - check __Align variables in columns__
> Clion
- Settings - Editor - Code Style - C/C++ - Wrapping and Braces - Variable groups - check __Align in columns__

```
  int  i        = 0;
  int  Count    = 0;
  Node *List    = NULL;
  Node *Current = NULL;
  Node *NewNode = NULL;
```

### 5. Wrapping Word

- To wrap word use __\'Ctrl + Alt + T(Surround With)\'__

![](./Image/WrappingWord_SurroundWith.gif)

- Also work with HTML tag!

![](./Image/WrappingWord_SurroundWithTag.gif)

- It works vice versa (which means remove surround tag)

![](./Image/Remove_Surround_Tag.gif)

- [reference link](https://gemi.tistory.com/469)


### 6. Extract/Introduce Variable

- Introduce Variable
![](./Image/Refactor_ExtractIntroduceVariable.gif)

- Extract Variable
![](./Image/Refactor_ExtractIntroduceVariable_02.gif.gif)

- [reference link](https://www.jetbrains.com/help/idea/extract-variable.html)


---

## Etc

### 1. ❌ Disable / Uninstall plugin without launching Idea

- Open FileExplorer than move to `C:\Users\{userName}\AppData\Roaming\JetBrains\{Idea}\plugins`

- Remove the latest plugin that makes you crash