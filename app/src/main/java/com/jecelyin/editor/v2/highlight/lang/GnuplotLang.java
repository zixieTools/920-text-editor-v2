/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class GnuplotLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"#\",\"NAME\":\"lineComment\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL2\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL2\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"[\"},{\"tag\":\"END\",\"text\":\"]\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL2\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"$\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"?\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\":\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"cd\"},{\"tag\":\"KEYWORD1\",\"text\":\"call\"},{\"tag\":\"KEYWORD1\",\"text\":\"clear\"},{\"tag\":\"KEYWORD1\",\"text\":\"exit\"},{\"tag\":\"KEYWORD1\",\"text\":\"fit\"},{\"tag\":\"KEYWORD1\",\"text\":\"help\"},{\"tag\":\"KEYWORD1\",\"text\":\"history\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"load\"},{\"tag\":\"KEYWORD1\",\"text\":\"pause\"},{\"tag\":\"KEYWORD1\",\"text\":\"plot\"},{\"tag\":\"KEYWORD1\",\"text\":\"using\"},{\"tag\":\"KEYWORD1\",\"text\":\"with\"},{\"tag\":\"KEYWORD1\",\"text\":\"index\"},{\"tag\":\"KEYWORD1\",\"text\":\"every\"},{\"tag\":\"KEYWORD1\",\"text\":\"smooth\"},{\"tag\":\"KEYWORD1\",\"text\":\"thru\"},{\"tag\":\"KEYWORD1\",\"text\":\"print\"},{\"tag\":\"KEYWORD1\",\"text\":\"pwd\"},{\"tag\":\"KEYWORD1\",\"text\":\"quit\"},{\"tag\":\"KEYWORD1\",\"text\":\"replot\"},{\"tag\":\"KEYWORD1\",\"text\":\"reread\"},{\"tag\":\"KEYWORD1\",\"text\":\"reset\"},{\"tag\":\"KEYWORD1\",\"text\":\"save\"},{\"tag\":\"KEYWORD1\",\"text\":\"set\"},{\"tag\":\"KEYWORD1\",\"text\":\"show\"},{\"tag\":\"KEYWORD1\",\"text\":\"unset\"},{\"tag\":\"KEYWORD1\",\"text\":\"shell\"},{\"tag\":\"KEYWORD1\",\"text\":\"splot\"},{\"tag\":\"KEYWORD1\",\"text\":\"system\"},{\"tag\":\"KEYWORD1\",\"text\":\"test\"},{\"tag\":\"KEYWORD1\",\"text\":\"unset\"},{\"tag\":\"KEYWORD1\",\"text\":\"update\"},{\"tag\":\"KEYWORD2\",\"text\":\"abs\"},{\"tag\":\"KEYWORD2\",\"text\":\"acos\"},{\"tag\":\"KEYWORD2\",\"text\":\"acosh\"},{\"tag\":\"KEYWORD2\",\"text\":\"arg\"},{\"tag\":\"KEYWORD2\",\"text\":\"asin\"},{\"tag\":\"KEYWORD2\",\"text\":\"asinh\"},{\"tag\":\"KEYWORD2\",\"text\":\"atan\"},{\"tag\":\"KEYWORD2\",\"text\":\"atan2\"},{\"tag\":\"KEYWORD2\",\"text\":\"atanh\"},{\"tag\":\"KEYWORD2\",\"text\":\"besj0\"},{\"tag\":\"KEYWORD2\",\"text\":\"besj1\"},{\"tag\":\"KEYWORD2\",\"text\":\"besy0\"},{\"tag\":\"KEYWORD2\",\"text\":\"besy1\"},{\"tag\":\"KEYWORD2\",\"text\":\"ceil\"},{\"tag\":\"KEYWORD2\",\"text\":\"cos\"},{\"tag\":\"KEYWORD2\",\"text\":\"cosh\"},{\"tag\":\"KEYWORD2\",\"text\":\"erf\"},{\"tag\":\"KEYWORD2\",\"text\":\"erfc\"},{\"tag\":\"KEYWORD2\",\"text\":\"exp\"},{\"tag\":\"KEYWORD2\",\"text\":\"floor\"},{\"tag\":\"KEYWORD2\",\"text\":\"gamma\"},{\"tag\":\"KEYWORD2\",\"text\":\"ibeta\"},{\"tag\":\"KEYWORD2\",\"text\":\"inverf\"},{\"tag\":\"KEYWORD2\",\"text\":\"igamma\"},{\"tag\":\"KEYWORD2\",\"text\":\"imag\"},{\"tag\":\"KEYWORD2\",\"text\":\"invnorm\"},{\"tag\":\"KEYWORD2\",\"text\":\"int\"},{\"tag\":\"KEYWORD2\",\"text\":\"lambertw\"},{\"tag\":\"KEYWORD2\",\"text\":\"lgamma\"},{\"tag\":\"KEYWORD2\",\"text\":\"log\"},{\"tag\":\"KEYWORD2\",\"text\":\"log10\"},{\"tag\":\"KEYWORD2\",\"text\":\"norm\"},{\"tag\":\"KEYWORD2\",\"text\":\"rand\"},{\"tag\":\"KEYWORD2\",\"text\":\"real\"},{\"tag\":\"KEYWORD2\",\"text\":\"sgn\"},{\"tag\":\"KEYWORD2\",\"text\":\"sin\"},{\"tag\":\"KEYWORD2\",\"text\":\"sinh\"},{\"tag\":\"KEYWORD2\",\"text\":\"sqrt\"},{\"tag\":\"KEYWORD2\",\"text\":\"tan\"},{\"tag\":\"KEYWORD2\",\"text\":\"tanh\"},{\"tag\":\"KEYWORD2\",\"text\":\"column\"},{\"tag\":\"KEYWORD2\",\"text\":\"defined\"},{\"tag\":\"KEYWORD2\",\"text\":\"tm_hour\"},{\"tag\":\"KEYWORD2\",\"text\":\"tm_mday\"},{\"tag\":\"KEYWORD2\",\"text\":\"tm_min\"},{\"tag\":\"KEYWORD2\",\"text\":\"tm_mon\"},{\"tag\":\"KEYWORD2\",\"text\":\"tm_sec\"},{\"tag\":\"KEYWORD2\",\"text\":\"tm_wday\"},{\"tag\":\"KEYWORD2\",\"text\":\"tm_yday\"},{\"tag\":\"KEYWORD2\",\"text\":\"tm_year\"},{\"tag\":\"KEYWORD2\",\"text\":\"valid\"},{\"tag\":\"KEYWORD3\",\"text\":\"angles\"},{\"tag\":\"KEYWORD3\",\"text\":\"arrow\"},{\"tag\":\"KEYWORD3\",\"text\":\"autoscale\"},{\"tag\":\"KEYWORD3\",\"text\":\"bars\"},{\"tag\":\"KEYWORD3\",\"text\":\"bmargin\"},{\"tag\":\"KEYWORD3\",\"text\":\"border\"},{\"tag\":\"KEYWORD3\",\"text\":\"boxwidth\"},{\"tag\":\"KEYWORD3\",\"text\":\"clabel\"},{\"tag\":\"KEYWORD3\",\"text\":\"clip\"},{\"tag\":\"KEYWORD3\",\"text\":\"cntrparam\"},{\"tag\":\"KEYWORD3\",\"text\":\"colorbox\"},{\"tag\":\"KEYWORD3\",\"text\":\"contour\"},{\"tag\":\"KEYWORD3\",\"text\":\"datafile\"},{\"tag\":\"KEYWORD3\",\"text\":\"decimalsign\"},{\"tag\":\"KEYWORD3\",\"text\":\"dgrid3d\"},{\"tag\":\"KEYWORD3\",\"text\":\"dummy\"},{\"tag\":\"KEYWORD3\",\"text\":\"encoding\"},{\"tag\":\"KEYWORD3\",\"text\":\"fit\"},{\"tag\":\"KEYWORD3\",\"text\":\"fontpath\"},{\"tag\":\"KEYWORD3\",\"text\":\"format\"},{\"tag\":\"KEYWORD3\",\"text\":\"functions\"},{\"tag\":\"KEYWORD3\",\"text\":\"function\"},{\"tag\":\"KEYWORD3\",\"text\":\"grid\"},{\"tag\":\"KEYWORD3\",\"text\":\"hidden3d\"},{\"tag\":\"KEYWORD3\",\"text\":\"historysize\"},{\"tag\":\"KEYWORD3\",\"text\":\"isosamples\"},{\"tag\":\"KEYWORD3\",\"text\":\"key\"},{\"tag\":\"KEYWORD3\",\"text\":\"label\"},{\"tag\":\"KEYWORD3\",\"text\":\"lmargin\"},{\"tag\":\"KEYWORD3\",\"text\":\"loadpath\"},{\"tag\":\"KEYWORD3\",\"text\":\"locale\"},{\"tag\":\"KEYWORD3\",\"text\":\"logscale\"},{\"tag\":\"KEYWORD3\",\"text\":\"mapping\"},{\"tag\":\"KEYWORD3\",\"text\":\"margin\"},{\"tag\":\"KEYWORD3\",\"text\":\"mouse\"},{\"tag\":\"KEYWORD3\",\"text\":\"multiplot\"},{\"tag\":\"KEYWORD3\",\"text\":\"mx2tics\"},{\"tag\":\"KEYWORD3\",\"text\":\"mxtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"my2tics\"},{\"tag\":\"KEYWORD3\",\"text\":\"mytics\"},{\"tag\":\"KEYWORD3\",\"text\":\"mztics\"},{\"tag\":\"KEYWORD3\",\"text\":\"offsets\"},{\"tag\":\"KEYWORD3\",\"text\":\"origin\"},{\"tag\":\"KEYWORD3\",\"text\":\"output\"},{\"tag\":\"KEYWORD3\",\"text\":\"parametric\"},{\"tag\":\"KEYWORD3\",\"text\":\"plot\"},{\"tag\":\"KEYWORD3\",\"text\":\"pm3d\"},{\"tag\":\"KEYWORD3\",\"text\":\"palette\"},{\"tag\":\"KEYWORD3\",\"text\":\"pointsize\"},{\"tag\":\"KEYWORD3\",\"text\":\"polar\"},{\"tag\":\"KEYWORD3\",\"text\":\"print\"},{\"tag\":\"KEYWORD3\",\"text\":\"rmargin\"},{\"tag\":\"KEYWORD3\",\"text\":\"rrange\"},{\"tag\":\"KEYWORD3\",\"text\":\"samples\"},{\"tag\":\"KEYWORD3\",\"text\":\"size\"},{\"tag\":\"KEYWORD3\",\"text\":\"style\"},{\"tag\":\"KEYWORD3\",\"text\":\"surface\"},{\"tag\":\"KEYWORD3\",\"text\":\"terminal\"},{\"tag\":\"KEYWORD3\",\"text\":\"tics\"},{\"tag\":\"KEYWORD3\",\"text\":\"ticslevel\"},{\"tag\":\"KEYWORD3\",\"text\":\"ticscale\"},{\"tag\":\"KEYWORD3\",\"text\":\"timestamp\"},{\"tag\":\"KEYWORD3\",\"text\":\"timefmt\"},{\"tag\":\"KEYWORD3\",\"text\":\"title\"},{\"tag\":\"KEYWORD3\",\"text\":\"tmargin\"},{\"tag\":\"KEYWORD3\",\"text\":\"trange\"},{\"tag\":\"KEYWORD3\",\"text\":\"urange\"},{\"tag\":\"KEYWORD3\",\"text\":\"variables\"},{\"tag\":\"KEYWORD3\",\"text\":\"version\"},{\"tag\":\"KEYWORD3\",\"text\":\"view\"},{\"tag\":\"KEYWORD3\",\"text\":\"vrange\"},{\"tag\":\"KEYWORD3\",\"text\":\"x2data\"},{\"tag\":\"KEYWORD3\",\"text\":\"x2dtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"x2label\"},{\"tag\":\"KEYWORD3\",\"text\":\"x2mtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"x2range\"},{\"tag\":\"KEYWORD3\",\"text\":\"x2tics\"},{\"tag\":\"KEYWORD3\",\"text\":\"x2zeroaxis\"},{\"tag\":\"KEYWORD3\",\"text\":\"xdata\"},{\"tag\":\"KEYWORD3\",\"text\":\"xdtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"xlabel\"},{\"tag\":\"KEYWORD3\",\"text\":\"xmtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"xrange\"},{\"tag\":\"KEYWORD3\",\"text\":\"xtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"xzeroaxis\"},{\"tag\":\"KEYWORD3\",\"text\":\"y2data\"},{\"tag\":\"KEYWORD3\",\"text\":\"y2dtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"y2label\"},{\"tag\":\"KEYWORD3\",\"text\":\"y2mtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"y2range\"},{\"tag\":\"KEYWORD3\",\"text\":\"y2tics\"},{\"tag\":\"KEYWORD3\",\"text\":\"y2zeroaxis\"},{\"tag\":\"KEYWORD3\",\"text\":\"ydata\"},{\"tag\":\"KEYWORD3\",\"text\":\"ydtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"ylabel\"},{\"tag\":\"KEYWORD3\",\"text\":\"ymtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"yrange\"},{\"tag\":\"KEYWORD3\",\"text\":\"ytics\"},{\"tag\":\"KEYWORD3\",\"text\":\"yzeroaxis\"},{\"tag\":\"KEYWORD3\",\"text\":\"zdata\"},{\"tag\":\"KEYWORD3\",\"text\":\"zdtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"cbdata\"},{\"tag\":\"KEYWORD3\",\"text\":\"cbdtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"zero\"},{\"tag\":\"KEYWORD3\",\"text\":\"zeroaxis\"},{\"tag\":\"KEYWORD3\",\"text\":\"zlabel\"},{\"tag\":\"KEYWORD3\",\"text\":\"zmtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"zrange\"},{\"tag\":\"KEYWORD3\",\"text\":\"ztics\"},{\"tag\":\"KEYWORD3\",\"text\":\"cblabel\"},{\"tag\":\"KEYWORD3\",\"text\":\"cbmtics\"},{\"tag\":\"KEYWORD3\",\"text\":\"cbrange\"},{\"tag\":\"KEYWORD3\",\"text\":\"cbtics\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}