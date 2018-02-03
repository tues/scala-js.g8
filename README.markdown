A [Giter8][g8] template for Scala.js projects, created by following the [official Scala.js documentation][scalajs-tutorial] with some tiny improvements.

The project is using only two dependencies (other than Scala.js): scala-js-dom and scalatest. You can easily remove them if you want.

Usage
-----
If you have [SBT][sbt] version 0.13.13 or later, you can simply run:

```
sbt new tues/scala-js.g8
```

It will ask you a few questions (project name, Scala version etc.) and create a new directory named after the project.

After generating the project, you may want to edit the following files:

 - `src/main/scala/MainApp.scala`: contains a simple "hello world"
 - `src/main/resources/index.html`: a minimal HTML page which loads the generated JavaScript automatically
 - `build.sbt`: SBT build file, contains things such as library dependencies and a small snippet of code which generates `index-dev.html` (for use with `fastOptJS`) automatically based on `index.html`

The easiest way to build your project is:

```
sbt fastOptJS
```

You can then open `target/scala-2.12/classes/index-dev.html` (generated from your `index.html`) in your browser.

If you want SBT to automatically rebuild the project every time you change some files, run:

```
sbt '~fastOptJS'
```

Building with full optimization for production can be done with:

```
sbt fullOptJS
```

To use the fully optimized JavaScript you should open `target/scala-2.11/classes/index.html` (which is simply copied from your `src/main/resources/`).

Please consult [Scala.js documentation][scalajs-tutorial] for details.

Contributing
------------
All contributions are welcome. Please try to provide meaningful commit descriptions and make your commits atomic if possible.

Feel free to edit the copyright information in this file if you want to be included as one of the authors. By submitting a pull request you acknowledge that you are the author of the patch and you agree to redistribute the modified code under the same license as used by this project.

Template license
----------------
Written in 2017 by Paweł Bartkiewicz

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: https://github.com/foundweekends/giter8
[sbt]: http://www.scala-sbt.org/
[scalajs-tutorial]: https://www.scala-js.org/tutorial/basic/
