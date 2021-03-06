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
