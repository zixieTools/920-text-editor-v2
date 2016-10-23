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
public class ObjectrexxLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*(if|loop|do|else|select|otherwise|catch|finally|class|method|properties)(.*)\",\"NAME\":\"indentNextLines\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"/*\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"*/\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"--\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\",+-=<>/?^&*\",\"NAME\":\"wordBreakChars\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"(0x[\\\\p{XDigit}]+[lL]?|[\\\\p{Digit}]+(e[\\\\p{Digit}]*)?[lLdDfF]?)\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"--\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"::\",\"attrs\":{\"TYPE\":\"FUNCTION\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"LABEL\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"Address\"},{\"tag\":\"KEYWORD1\",\"text\":\"Arg\"},{\"tag\":\"KEYWORD1\",\"text\":\"Call\"},{\"tag\":\"KEYWORD1\",\"text\":\"Do\"},{\"tag\":\"KEYWORD1\",\"text\":\"Drop\"},{\"tag\":\"KEYWORD1\",\"text\":\"Exit\"},{\"tag\":\"KEYWORD1\",\"text\":\"Expose\"},{\"tag\":\"KEYWORD1\",\"text\":\"Forward\"},{\"tag\":\"KEYWORD1\",\"text\":\"Guard\"},{\"tag\":\"KEYWORD1\",\"text\":\"If\"},{\"tag\":\"KEYWORD1\",\"text\":\"Interpret\"},{\"tag\":\"KEYWORD1\",\"text\":\"Iterate\"},{\"tag\":\"KEYWORD1\",\"text\":\"Leave\"},{\"tag\":\"KEYWORD1\",\"text\":\"Nop\"},{\"tag\":\"KEYWORD1\",\"text\":\"Numeric\"},{\"tag\":\"KEYWORD1\",\"text\":\"Parse\"},{\"tag\":\"KEYWORD1\",\"text\":\"Procedure\"},{\"tag\":\"KEYWORD1\",\"text\":\"pull\"},{\"tag\":\"KEYWORD1\",\"text\":\"Push\"},{\"tag\":\"KEYWORD1\",\"text\":\"Queue\"},{\"tag\":\"KEYWORD1\",\"text\":\"Raise\"},{\"tag\":\"KEYWORD1\",\"text\":\"reply\"},{\"tag\":\"KEYWORD1\",\"text\":\"Return\"},{\"tag\":\"KEYWORD1\",\"text\":\"Say\"},{\"tag\":\"KEYWORD1\",\"text\":\"Seleect\"},{\"tag\":\"KEYWORD1\",\"text\":\"Signal\"},{\"tag\":\"KEYWORD1\",\"text\":\"Trace\"},{\"tag\":\"KEYWORD1\",\"text\":\"use\"},{\"tag\":\"KEYWORD1\",\"text\":\"Class\"},{\"tag\":\"KEYWORD1\",\"text\":\"Method\"},{\"tag\":\"KEYWORD1\",\"text\":\"Requires\"},{\"tag\":\"KEYWORD1\",\"text\":\"Routine\"},{\"tag\":\"KEYWORD1\",\"text\":\"Result\"},{\"tag\":\"KEYWORD1\",\"text\":\"RC\"},{\"tag\":\"KEYWORD1\",\"text\":\"Self\"},{\"tag\":\"KEYWORD1\",\"text\":\"Sigl\"},{\"tag\":\"KEYWORD1\",\"text\":\"Super\"},{\"tag\":\"KEYWORD2\",\"text\":\"Abbrev\"},{\"tag\":\"KEYWORD2\",\"text\":\"Abs\"},{\"tag\":\"KEYWORD2\",\"text\":\"Address\"},{\"tag\":\"KEYWORD2\",\"text\":\"Arg\"},{\"tag\":\"KEYWORD2\",\"text\":\"Beep\"},{\"tag\":\"KEYWORD2\",\"text\":\"BitAnd\"},{\"tag\":\"KEYWORD2\",\"text\":\"BitOr\"},{\"tag\":\"KEYWORD2\",\"text\":\"BitXor\"},{\"tag\":\"KEYWORD2\",\"text\":\"B2X\"},{\"tag\":\"KEYWORD2\",\"text\":\"Center\"},{\"tag\":\"KEYWORD2\",\"text\":\"ChangeStr\"},{\"tag\":\"KEYWORD2\",\"text\":\"CharIn\"},{\"tag\":\"KEYWORD2\",\"text\":\"CharOut\"},{\"tag\":\"KEYWORD2\",\"text\":\"Chars\"},{\"tag\":\"KEYWORD2\",\"text\":\"Compare\"},{\"tag\":\"KEYWORD2\",\"text\":\"Consition\"},{\"tag\":\"KEYWORD2\",\"text\":\"Copies\"},{\"tag\":\"KEYWORD2\",\"text\":\"CountStr\"},{\"tag\":\"KEYWORD2\",\"text\":\"C2D\"},{\"tag\":\"KEYWORD2\",\"text\":\"C2X\"},{\"tag\":\"KEYWORD2\",\"text\":\"DataType\"},{\"tag\":\"KEYWORD2\",\"text\":\"Date\"},{\"tag\":\"KEYWORD2\",\"text\":\"DelStr\"},{\"tag\":\"KEYWORD2\",\"text\":\"DelWord\"},{\"tag\":\"KEYWORD2\",\"text\":\"Digits\"},{\"tag\":\"KEYWORD2\",\"text\":\"Directory\"},{\"tag\":\"KEYWORD2\",\"text\":\"D2C\"},{\"tag\":\"KEYWORD2\",\"text\":\"D2X\"},{\"tag\":\"KEYWORD2\",\"text\":\"ErrorText\"},{\"tag\":\"KEYWORD2\",\"text\":\"FileSpec\"},{\"tag\":\"KEYWORD2\",\"text\":\"Form\"},{\"tag\":\"KEYWORD2\",\"text\":\"Format\"},{\"tag\":\"KEYWORD2\",\"text\":\"Fuzz\"},{\"tag\":\"KEYWORD2\",\"text\":\"Insert\"},{\"tag\":\"KEYWORD2\",\"text\":\"LastPos\"},{\"tag\":\"KEYWORD2\",\"text\":\"Left\"},{\"tag\":\"KEYWORD2\",\"text\":\"Length\"},{\"tag\":\"KEYWORD2\",\"text\":\"LineIn\"},{\"tag\":\"KEYWORD2\",\"text\":\"LineOut\"},{\"tag\":\"KEYWORD2\",\"text\":\"Lines\"},{\"tag\":\"KEYWORD2\",\"text\":\"Max\"},{\"tag\":\"KEYWORD2\",\"text\":\"Min\"},{\"tag\":\"KEYWORD2\",\"text\":\"Overlay\"},{\"tag\":\"KEYWORD2\",\"text\":\"Pos\"},{\"tag\":\"KEYWORD2\",\"text\":\"Queued\"},{\"tag\":\"KEYWORD2\",\"text\":\"Random\"},{\"tag\":\"KEYWORD2\",\"text\":\"Reverse\"},{\"tag\":\"KEYWORD2\",\"text\":\"Right\"},{\"tag\":\"KEYWORD2\",\"text\":\"Sign\"},{\"tag\":\"KEYWORD2\",\"text\":\"SourceLine\"},{\"tag\":\"KEYWORD2\",\"text\":\"Space\"},{\"tag\":\"KEYWORD2\",\"text\":\"Stream\"},{\"tag\":\"KEYWORD2\",\"text\":\"Strip\"},{\"tag\":\"KEYWORD2\",\"text\":\"SubStr\"},{\"tag\":\"KEYWORD2\",\"text\":\"SubWord\"},{\"tag\":\"KEYWORD2\",\"text\":\"Symbol\"},{\"tag\":\"KEYWORD2\",\"text\":\"Time\"},{\"tag\":\"KEYWORD2\",\"text\":\"Trace\"},{\"tag\":\"KEYWORD2\",\"text\":\"Translate\"},{\"tag\":\"KEYWORD2\",\"text\":\"Trunc\"},{\"tag\":\"KEYWORD2\",\"text\":\"Value\"},{\"tag\":\"KEYWORD2\",\"text\":\"Var\"},{\"tag\":\"KEYWORD2\",\"text\":\"Verify\"},{\"tag\":\"KEYWORD2\",\"text\":\"Word\"},{\"tag\":\"KEYWORD2\",\"text\":\"WordIndex\"},{\"tag\":\"KEYWORD2\",\"text\":\"WordLength\"},{\"tag\":\"KEYWORD2\",\"text\":\"WordPos\"},{\"tag\":\"KEYWORD2\",\"text\":\"Words\"},{\"tag\":\"KEYWORD2\",\"text\":\"XRange\"},{\"tag\":\"KEYWORD2\",\"text\":\"X2B\"},{\"tag\":\"KEYWORD2\",\"text\":\"X2C\"},{\"tag\":\"KEYWORD2\",\"text\":\"X2D\"},{\"tag\":\"KEYWORD2\",\"text\":\"RxFuncAdd\"},{\"tag\":\"KEYWORD2\",\"text\":\"RxFuncDrop\"},{\"tag\":\"KEYWORD2\",\"text\":\"RxFuncQuery\"},{\"tag\":\"KEYWORD2\",\"text\":\"RxMessageBox\"},{\"tag\":\"KEYWORD2\",\"text\":\"RxWinExec\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysAddRexxMacro\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysBootDrive\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysClearRexxMacroSpace\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysCloseEventSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysCloseMutexSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysCls\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysCreateEventSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysCreateMutexSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysCurPos\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysCurState\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysDriveInfo\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysDriveMap\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysDropFuncs\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysDropRexxMacro\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysDumpVariables\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysFileDelete\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysFileSearch\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysFileSystemType\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysFileTree\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysFromUnicode\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysToUnicode\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysGetErrortext\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysGetFileDateTime\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysGetKey\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysIni\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysLoadFuncs\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysLoadRexxMacroSpace\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysMkDir\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysOpenEventSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysOpenMutexSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysPostEventSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysPulseEventSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysQueryProcess\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysQueryRexxMacro\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysReleaseMutexSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysReorderRexxMacro\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysRequestMutexSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysResetEventSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysRmDir\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysSaveRexxMacroSpace\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysSearchPath\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysSetFileDateTime\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysSetPriority\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysSleep\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysStemCopy\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysStemDelete\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysStemInsert\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysStemSort\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysSwitchSession\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysSystemDirectory\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysTempFileName\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysTextScreenRead\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysTextScreenSize\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysUtilVersion\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysVersion\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysVolumeLabel\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysWaitEventSem\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysWaitNamedPipe\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysWinDecryptFile\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysWinEncryptFile\"},{\"tag\":\"KEYWORD2\",\"text\":\"SysWinVer\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}