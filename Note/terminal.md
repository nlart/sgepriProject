1.批处理将某一文件夹下所有目录中.jpg后缀文件改成.png后缀文件并通过终端输出修改文件个数

@echo off
set num = 0
For /r  . %%i in (*.jpg) do (
set /a num += 1
echo %%i
call echo 第 %%num%% 个文件处理成功
ren %%i *.png) 
echo 共%num%个文件被处理成功
pause>nul

注：批处理（bat）文件中输出中文乱码问题，用【记事本】打开该bat文件 >【另存为】>【修改编码为： ANSI 】

1.卸载homebrew：/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/uninstall.sh)"
2.安装国内源homebrew：/bin/zsh -c "$(curl -fsSL https://gitee.com/cunkai/HomebrewCN/raw/master/Homebrew.sh)"
3.homebrew更新：brew update

