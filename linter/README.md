# Linter

This linter will test whether a given file contains semicolons at the end of all lines, except:
* Lines with an open brace {
* Lines with a closed brace }
* Lines containing if
* Lines containing else

If lines not meeting the above conditions are found without semicolons at the end, the linter will note the line number and "Missing semicolon."

If all lines are either ineligible or end with a semicolon, the linter will provide the result "No errors."

Empty files will also return as "No errors."


