http://www.jesshamrick.com/2012/09/10/absolute-beginners-guide-to-emacs/
Keyboard Shortcuts
M-x : Alt(mac os) + x or Windows(win) + x
C-h : Ctrl + h

C-_ : undo

FILE operation
C-x C-f : open file
C-x C-s : save file
C-x C-w : save file as
C-x C-c : quit/exit

BUFFER operation
C-x k : kill/close a buffer
C-g : quit the mini-buffer

WINDOW operation
C-x 0 : close the active window
C-x 1 : close all windows except the active window
C-x 2 : split the active window vertically into two horizontal windows
C-x right: cycle through buffers sequentially
C-x 3 : split the active window horizontally into two vertical windows
C-x o : change active window to next window

:: buffers AND windows
if you are frequently switching between five different files but you only have two windows open,
it is better to open all files once, load them into buffers (memory), and then switch between the buffers instead.

Manipulating text
C-SPC: select a region(text area)
::C-SPC brings up the Spotlight search field window on Mac OS, use Ctrl-Shift-SPACE in emacs instead of C-SPC

C-k: kill/cut THE region
C-y: yank/paste THE region
::The kill operation is analogous to “cut”, and yank is analogous to “paste”.

C-_: undo
M-w: kill without deleting ???

C-s: to search forward
C-r: to search backward
::C-s keys with search model in mini-buffer and then enter search words with C-s/r to search it.

M-%: find and replace a search query
::step:
1.select region
2.M-% input Query replace and replace with string
3.Space keyboard as replace, ! replace all and n step to next
::M键在mac中使用esc代替
