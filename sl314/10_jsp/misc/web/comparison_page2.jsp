<HTML>
<HEAD><TITLE>Comparison and Logical Operations in EL</TITLE></HEAD>
<BODY>
  <CENTER><H1>Comparisons and Logical Operations in EL</H1></CENTER>
  <TABLE BORDER='1' ALIGN='CENTER' WIDTH='400'>
    <TR>
      <TD WIDTH='300'>\${10 > 5}</TD>
      <TD WIDTH='100'>${10 > 5}</TD>
    </TR>
    <TR>
      <TD WIDTH='300'>\${10 != 5}</TD>
      <TD WIDTH='100'>${10 != 5}</TD>
    </TR>
    <TR>
      <TD WIDTH='300'>\${'tim' > 'tom'}</TD>
      <TD WIDTH='100'>${'tim' > 'tom'}</TD>
    </TR>
    <TR>
      <TD WIDTH='300'>\${(3 + 4) ge 5}</TD>
      <TD WIDTH='100'>${(3 + 4) ge 5}</TD>
    </TR>
    <TR>
      <TD WIDTH='300'>\${'true' > 'false'}</TD>
      <TD WIDTH='100'>${'true' > 'false'}</TD>
    </TR>
    <TR>
      <TD WIDTH='300'>\${'true' eq true}</TD>
      <TD WIDTH='100'>${'true' eq true}</TD>
    </TR>
    <TR>
      <TD WIDTH='300'>\${10 > 5 && 'true'}</TD>
      <TD WIDTH='100'>${10 > 5 && 'true'}</TD>
    </TR>
    <TR>
      <TD WIDTH='300'>\${(true or false) and true}</TD>
      <TD WIDTH='100'>${(true or false) and true}</TD>
    </TR>
  </TABLE>
</BODY>
