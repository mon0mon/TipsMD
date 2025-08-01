# VIM Tips

- [VIM Tips](#vim-tips)
  - [Comment](#comment)
  - [Uncomment](#uncomment)
  - [Screen Move](#screen-move)
  - [Replace Text](#replace-text)
  - [Adding New Line without Insert mode](#adding-new-line-without-insert-mode)
  - [Autocomplete based on history](#autocomplete-based-on-history)
  - [Searching keyword Case Insensitively](#searching-keyword-case-insensitively)
  - [Automatic line center after line jump](#automatic-line-center-after-line-jump)
  - [Word Select than modify](#word-select-than-modify)
  - [Modify single character](#modify-single-character)
  - [Change case](#change-case)
  - [Cursor Move](#cursor-move)
  - [Multitasking with Vim](#multitasking-with-vim)
  - [Search copied keyword](#search-copied-keyword)
  - [Inc/Dec alphabet](#incdec-alphabet)
  - [Edit Readonly file (with `Sudo` Permission)](#edit-readonly-file-with-sudo-permission)
  - [Cursor change depends on mode](#cursor-change-depends-on-mode)
  - [Move Around Tag](#move-around-tag)
  - [Highlight Search Keyword](#highlight-search-keyword)
  - [Repeat Character](#repeat-character)
  - [Preview Search Keyword](#preview-search-keyword)
  - [Move to Previous/Next Cursor Position](#move-to-previousnext-cursor-position)
  - [Increment/Decrement Number in line](#incrementdecrement-number-in-line)

---

## Comment

- To comment multiple line at once, you can type

```
:{startline}, {endline}s/^/{commentType}
```

<img src="./Images/CommentMultiline.gif">

```
:6,7s/^/#
```

- Option 2
```
<visual_mode>{line select}: norm i{comment}
```

<img src="./Images/CommentMultiline2.gif">

## Uncomment

- To Uncomment multiple line at once is vice versa

```
:{startline}, {endline}s/^{commentType}/
```

<img src="./Images/UncommentMultiline.gif">

```
:6,7s/^#/
```

- Option 2
```
<visual_mode>{line select}: norm x{comment character count}
```

<img src="./Images/UncommentMultiline2.gif">

[link](https://www.usessionbuddy.com/post/How-To-Comment-Out-And-UnComment-Multiple-Lines-At-Once-In-Vim-Editor/)

---

## Screen Move

- To set current line to center, you can type

```
    zz
```

<img src="./Images/ScreenCenter.gif">

---

## Replace Text

- To replace String in file, you can type

  ```
  :{Scope}/{String1}/{String2}/{Option}
  ```

- Usecase

  1. Replcae all string in file

  ```
  :%s/{String1}/{String2}/g
  ```

  2. Replcae all string in current line (which cursor loacte)

  ```
  :s/{String1}/{String2}/g
  ```

  3. Replace all string from current line to end of file

  ```
  :.,$s/{String1}/{String2}/g
  ```

  4. Replace with Regex
  ```
  :%s/{Target Regex}/{Replace Regex}/g
  ```

  - If Regex Pattern not work than ensure use backslash `\`
  - Regex Capturing Group is work fine
  
  | Replacing text using capturing group

  ```
  ex) Replacing all the '+[a-zA-Z]' to '+ [a-zA-z]'
  :%s/\+([a-zA-Z])/+ \1/g
  ```

  ![alt text](Images/ReplaceTextWithRegex.gif.gif)

  [link](https://stackoverflow.com/questions/19902089/vim-regex-capture-groups-bau-byau-ceu-cyeu)

---

## Adding New Line without Insert mode

- map a new command

  1. Insert new line under current cursor

  ```
  nmap oo o<Esc>k
  ```

    <img src="./Images/Insert_New_Line_Under.gif">

  2. Insert new line over current cursor

  ```
  nmap OO O<Esc>j
  ```

    <img src="./Images/Insert_New_Line_Over.gif">

[link](https://stackoverflow.com/questions/16134457/insert-a-newline-without-entering-in-insert-mode-vim)

---

## Autocomplete based on history

- **(NOTE) In IdeaVim you need to map a command in .ideavimrc**

```
imap <C-n> <ESC>:action HippieCompletion<CR>a
imap <C-p> <ESC>:action HippieBackwardCompletion<CR>a
```

- After setup simple use command to compelete code.

```
ctrl + n (HippieCompletion)
ctrl + p (HippieBackwardCompletion)
```

[link](https://stackoverflow.com/questions/30149091/how-to-configure-in-ideavim-ctrl-n-and-ctrl-p-completion-from-vim)

---

## Searching keyword Case Insensitively

- Simply add **\c** to the keyword

- Example (keyword : **int**)

```
/\cint
```

<img src="./Images/Search_CaseInsensitively.gif">

[link](https://ohgyun.com/719)

## Automatic line center after line jump

- **(NOTE) In IdeaVim you need to map a command in .ideavimrc**

```
; Center screen on next/previous selection.
nnoremap n nzz
nnoremap N Nzz
; Last and next jump should center too.
nnoremap <C-o> <C-o>zz
nnoremap <C-i> <C-i>zzimap <C-n> <ESC>:action HippieCompletion<CR>a
imap <C-p> <ESC>:action HippieBackwardCompletion<CR>a
```

- After setup simple use command

```
{Line Number}zz
```

<img src="./Images/AutoLineCenter_AfterLineMove.gif">

[link](https://stackoverflow.com/questions/2372584/auto-zz-in-vim-after-a-jump)

## Word Select than modify

1. Select Word

`viw`

<img src="./Images/WordSelect_VIW.gif">

2. Delete Word

<img src="./Images/WordSelect_DAW.gif">

3. Delete than Insert

<img src="./Images/WordSelect_CAW.gif">

## Modify single character

1.  Delete Character

`(Normal Mode) x`

<img src="./Images/Modify single character_X.gif">

`(Normal Mode) r(Enter key)`

<img src="./Images/Modify single character_R.gif">

## Change case

```
~ (tilt)
```

![ChangeCase.gif](./Images/ChangeCase.gif)

## Cursor Move

1. Movement by Sentence

![CursorMove_MovementBySentence_01.gif](./Images/CursorMove_MovementBySentence_01.gif)

- Forward `(`

![CursorMove_MovementBySentence_02.gif](./Images/CursorMove_MovementBySentence_02.gif)

- Backward `)`

2. Movement by Paragraph

![CusorMove_MovementByParagraph_01](./Images/CursorMove_MovementByParagraph_01.gif)

- Forward `{`

![CusorMove_MovementByParagraph_02](./Images/CursorMove_MovementByParagraph_02.gif)

## Multitasking with Vim

```bash
Ctrl + Z
fg
```

![MultitaskingWithVim](./Images/MultitaskingWithVim.gif)

## Search copied keyword

- `y` (yank selected text)
- `/` (enter search mode)
- `Ctrl + r` + `"` (insert text from `"` register)
- `enter`

![SearchCopiedKeyword](./Images/SearchCopiedKeyword.gif)

[StackExchange](https://superuser.com/questions/41378/how-to-search-for-selected-text-in-vim)

## Inc/Dec alphabet

`:set nrformats+=alpha`

or

`set nrformats+=alpha` to `.vimrc`

![IncDecAlphabet](./Images/IncDecAlphabet.gif)

[Riptutorial](https://riptutorial.com/vim/example/8327/incrementing-and-decrementing-numbers-and-alphabetical-characters)

## Edit Readonly file (with `Sudo` Permission)

`:w !sudo tee %`

than press `L`

![EditReadOnly](./Images/EditReadOnly.gif)

[StackExchange](https://superuser.com/questions/694450/using-vim-to-force-edit-a-file-when-you-opened-without-permissions)

## Cursor change depends on mode

```
set cursorline
set nocursorline
```

- Put this options to `.vimrc`

![CursorChangeDependsOnMode](./Images/CursorChangeDependsOnMode.gif)

## Move Around Tag

1. Enter visual mode by pressing `v`
2. Type following commands
    - Use `it` to move inside tag 
    - Use `at` to move outside tag
3. Adjust cursor location by `o`
   - Switch between `Begining` or `Closing`

> Move Around Inner Tag   
![MoveAroundTag_Inner](./Images/MoveAroundTag_Inner.gif)

> Move Around Outside Tag
![MoveAroundTag_Outter](./Images/MoveAroundTag_Outer.gif)

[SuperUser](https://superuser.com/questions/189815/how-to-navigate-between-begin-and-end-html-tag-in-vim)

## Highlight Search Keyword

1. For 1 time use
   ```
   :se hlsearch
   ```
2. .vimrc
   ```
   set hlsearch
   ```

- Before
![Befre](Images/Search_Highlight_Before.gif)

- After
![Alt text](Images/Search_Highlight_After.gif)

- use `:noh` to turn off the highlight
- or you can bind shortcut in .vimrc
  ```
  nnoremap <ESC> :noh<CR>
  ```

## Repeat Character

1. In Command Mode
```
:norm {amount}[i|a]{ch}
```
```
<insert_mode>{text}<ESC>{repeatAmout}.
```
```
<ESC>{amount}[i|a]{ch}<ESC>
```

![repeat character](Images/Repeat_Chracter.gif)

[StackOverflow](https://stackoverflow.com/questions/5054128/repeating-characters-in-vim-insert-mode)

## Preview Search Keyword

- add in .vimrc

```
set incsearch
```

![Preview Search Keyword](Images/Preview_Search_Keyword.gif)

## Move to Previous/Next Cursor Position

1. `Ctrl + o` : Move to Previous Cursor Position
2. `Ctrl + i` : Move to Next Cursor Position

![Move to Previous/Next Cursor Position](Images/Move_Previous_Next_Cursor_Position.gif)

## Increment/Decrement Number in line

1. Select all numbers in line with `Visual Mode`
2. `g + 'Ctrl + a'` to Increment all numbers
3. `g + 'Ctrl + x'` to Decrement all numbers

![Increment numbers](Images/Increment_All_Numbers_In_Line.gif)
![Decrement numbers](Images/Decrement_All_Numbers_In_Line.gif)