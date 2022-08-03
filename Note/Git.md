基础命令：
1.echo $SHELL ：查看当前默认的shell（分为zsh和bash）
2.cat /etc/shells ：查看已安装的shell
3.zsh --version：查看当前zsh版本
4.brew info zsh：查看zsh最新版本
5.brew install zsh：更新zsh
4.chsh -s /bin/zsh：切换为zsh

homebrew安装：/bin/zsh -c "$(curl -fsSL https://gitee.com/cunkai/HomebrewCN/raw/master/Homebrew.sh)"
homebrew卸载：/bin/zsh -c "$(curl -fsSL https://gitee.com/cunkai/HomebrewCN/raw/master/HomebrewUninstall.sh)"
安装软件：brew install xxx
卸载软件：brew uninstall xxx
搜索软件：brew search xxx
更新软件：brew upgrade xxx
查看列表：brew list
更新brew：brew update
清理所有包的旧版本：brew cleanup
清理指定包的旧版本：brew cleanup $FORMULA
查看可清理的旧版本包，不执行实际操作：brew cleanup -n

报错及解决方案：
1.Error: Command failed with exit 128: git
git -C "/usr/local/Homebrew" remote set-url origin https://github.com/Homebrew/brew
rm -rf "/usr/local/Homebrew/Library/Taps/homebrew/homebrew-cask"
brew tap homebrew/cask
rm -rf "/usr/local/Homebrew/Library/Taps/homebrew/homebrew-core"
brew tap homebrew/core

Warning: Unbrewed dylibs were found in /usr/local/lib.
If you didn't put them there on purpose they could cause problems when
building Homebrew formulae, and may need to be deleted.