/* adac_4TokenManager.java */
/* Generated By:JavaCC: Do not edit this line. adac_4TokenManager.java */
package traductor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import lib.attributes.Attributes;
import lib.symbolTable.*;
import lib.symbolTable.exceptions.*;
import lib.symbolTable.Symbol.ParameterClass;
import lib.symbolTable.Symbol.Types;
import lib.tools.exceptions.*;
import lib.tools.codeGeneration.*;
import lib.tools.codeGeneration.PCodeInstruction.OpCode;
import lib.tools.SemanticFunctions;
import lib.tools.SemanticFunctions.Operator;

/** Token Manager. */
@SuppressWarnings ("unused")
public class adac_4TokenManager implements adac_4Constants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000000L) != 0L)
            return 0;
         if ((active0 & 0xfbffdc0c038000L) != 0L)
         {
            jjmatchedKind = 56;
            return 25;
         }
         if ((active0 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 56;
            return 10;
         }
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 56;
            return 14;
         }
         return -1;
      case 1:
         if ((active0 & 0xddff740c038000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 1;
            return 26;
         }
         if ((active0 & 0x22008800000000L) != 0L)
            return 26;
         return -1;
      case 2:
         if ((active0 & 0x5ce46000038000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 2;
            }
            return 26;
         }
         if ((active0 & 0x811b140c000000L) != 0L)
            return 26;
         return -1;
      case 3:
         if ((active0 & 0x50a46000038000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 3;
            return 26;
         }
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 3;
            return 27;
         }
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 3;
            return 28;
         }
         if ((active0 & 0xc000000000000L) != 0L)
            return 26;
         return -1;
      case 4:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 4;
            return 28;
         }
         if ((active0 & 0x800000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 4;
            return 27;
         }
         if ((active0 & 0x50000000000000L) != 0L)
            return 26;
         if ((active0 & 0x546000038000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 4;
            return 26;
         }
         return -1;
      case 5:
         if ((active0 & 0xf06000038000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 5;
            return 26;
         }
         if ((active0 & 0x40000000000L) != 0L)
            return 26;
         return -1;
      case 6:
         if ((active0 & 0xf06000020000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 6;
            return 26;
         }
         if ((active0 & 0x18000L) != 0L)
            return 26;
         return -1;
      case 7:
         if ((active0 & 0x804000020000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 7;
            return 26;
         }
         if ((active0 & 0x702000000000L) != 0L)
            return 26;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 40:
         return jjStopAtPos(0, 11);
      case 41:
         return jjStopAtPos(0, 12);
      case 42:
         return jjStopAtPos(0, 25);
      case 43:
         return jjStopAtPos(0, 23);
      case 44:
         return jjStopAtPos(0, 10);
      case 45:
         return jjStartNfaWithStates_0(0, 24, 0);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 59:
         return jjStopAtPos(0, 9);
      case 60:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x120000000L);
      case 61:
         return jjStopAtPos(0, 28);
      case 62:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 91:
         return jjStopAtPos(0, 13);
      case 93:
         return jjStopAtPos(0, 14);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x40000000010000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x200000020000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x20000004000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x88000000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x2408000008000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x184000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x60000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x10000000000000L);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 61:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 62:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x41060000000000L);
      case 102:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 49, 26);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x14200000020000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x80400400008000L);
      case 111:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 53, 26);
         return jjMoveStringLiteralDfa2_0(active0, 0x1008010000L);
      case 114:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(1, 35, 26);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 115:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 39, 26);
         break;
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x182000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000020000L);
      case 100:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 26);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 26);
         else if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 55, 26);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L);
      case 102:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 41, 26);
         break;
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x10800000000000L);
      case 108:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 26);
         break;
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000010000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000000L);
      case 116:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 26);
         else if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 48, 26);
         return jjMoveStringLiteralDfa3_0(active0, 0x540000008000L);
      case 118:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 50:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      case 95:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x6000000000L);
      case 101:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 51, 26);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000010000L);
      case 110:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 50, 26);
         break;
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000020000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 50:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000000L);
      case 95:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000000L);
      case 101:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 52, 26);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000010000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000L);
      case 110:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 54, 26);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x302000000000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000000L);
      case 110:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 42, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000000L);
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 26);
         return jjMoveStringLiteralDfa7_0(active0, 0x300000000000L);
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000000L);
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 26);
         break;
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 44, 26);
         return jjMoveStringLiteralDfa8_0(active0, 0x20000L);
      case 110:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 37, 26);
         return jjMoveStringLiteralDfa8_0(active0, 0x800000000000L);
      case 114:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 46, 26);
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000000L);
      case 116:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 45, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 38, 26);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 47, 26);
         break;
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(8, 17, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 25;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAdd(4); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(17, 18); }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar != 45)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 1:
                  if ((0xfffffffffffffbffL & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 10 && kind > 8)
                     kind = 8;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(4); }
                  break;
               case 5:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if (curChar == 39 && kind > 19)
                     kind = 19;
                  break;
               case 16:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(17, 18); }
                  break;
               case 17:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(17, 18); }
                  break;
               case 18:
                  if (curChar == 34 && kind > 21)
                     kind = 21;
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 28:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  else if (curChar == 95)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 14:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  else if (curChar == 95)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 10:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  else if (curChar == 95)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 27:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 26:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  else if (curChar == 95)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 25:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  else if (curChar == 95)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  break;
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                     { jjCheckNAddStates(0, 2); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 1:
                  if (kind > 8)
                     kind = 8;
                  { jjAddStates(3, 4); }
                  break;
               case 6:
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 8:
                  if (curChar == 101 && kind > 20)
                     kind = 20;
                  break;
               case 9:
                  if (curChar == 117)
                     { jjCheckNAdd(8); }
                  break;
               case 11:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 115)
                     { jjCheckNAdd(8); }
                  break;
               case 13:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 17:
                  { jjAddStates(5, 6); }
                  break;
               case 19:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 20:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 21:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  break;
               case 22:
                  if (curChar != 95)
                     break;
                  if (kind > 56)
                     kind = 56;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 24:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(22); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjAddStates(3, 4); }
                  break;
               case 6:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 17:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(5, 6); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\73", "\54", "\50", 
"\51", "\133", "\135", "\151\156\164\145\147\145\162", 
"\142\157\157\154\145\141\156", "\143\150\141\162\141\143\164\145\162", null, null, null, null, "\72\75", 
"\53", "\55", "\52", "\144\151\166", "\155\157\144", "\75", "\74\76", "\74", "\76", 
"\74\75", "\76\75", "\141\156\144", "\157\162", "\156\157\164", 
"\146\165\156\143\164\151\157\156", "\160\162\157\143\145\144\165\162\145", "\151\163", "\166\141\154", 
"\162\145\146", "\162\145\164\165\162\156", "\160\165\164", 
"\160\165\164\137\154\151\156\145", "\143\150\141\162\62\151\156\164", "\151\156\164\62\143\150\141\162", 
"\163\153\151\160\137\154\151\156\145", "\147\145\164", "\151\146", "\164\150\145\156", "\145\154\163\145", 
"\167\150\151\154\145", "\144\157", "\142\145\147\151\156", "\145\156\144", null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   20, 21, 23, 1, 2, 17, 18, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 57)
   {
      jjmatchedKind = 57;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
            SkipLexicalActions(matchedToken);
         }
         else
            SkipLexicalActions(null);
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 57 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                        System.err.println("ERROR LEXICO: (" +
                                matchedToken.beginLine + "," + matchedToken.beginColumn +
                                "): simbolo no reconocido: " + matchedToken);
         break;
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public adac_4TokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public adac_4TokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 25; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1fffffffffffe01L, 
};
static final long[] jjtoSkip = {
   0x20000000000013eL, 
};
static final long[] jjtoSpecial = {
   0x200000000000100L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[25];
    static private final int[] jjstateSet = new int[2 * 25];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
