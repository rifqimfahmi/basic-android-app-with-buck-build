# Basic Android Application build with Buck build tool
Simple Android app that build using buck build tool by Facebook. Understanding how the buck build system work.

Buck version used: `buck version 0f3ffb4da13ccc6df138344a3e20990b94ee1946`

Buck repo: [link](https://github.com/facebook/buck)

# How to use
1. Install buck. I did it by build from the source. or if you are using mac, you can use `brew`. See the detailed install instructions [here](https://buck.build/setup/getting_started.html)
2. run `buck build //app:app` or `buck install -r //app:app` to install and run it to your connected Android device
