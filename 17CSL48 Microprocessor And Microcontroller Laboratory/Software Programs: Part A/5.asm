;Design and develop an assembly language program to read the current time and Date from the system and display it in the standard format on the
;screen.

.MODEL SMALL
.STACK

.DATA
	MSG DB 10,13,'Current time and date is =$'

.CODE
	MOV AX,@DATA
	MOV DS,AX

	LEA DX,MSG
	MOV AH,09H
	INT 21H

	MOV AH,2CH
	INT 12H
	MOV AL,CH
	CALL DISP

	MOV DL,':'
	MOV AH,02H
	INT 21H

	MOV AL,CL
	CALL DISP

	MOV DL,' '
	MOV AH,02H
	INT 21H

	MOV AH,2AH
	INT 21H
	MOV AL,DL
	CALL DISP

	MOV DL,'/'
	MOV AH,02H
	INT 21H

	MOV AH,2AH
	INT 21H
	MOV AL,DH
	CALL DISP

	MOV DL,'/'
	MOV AH,02H
	INT 21H

	MOV AH,2AH
	INT 21H
	ADD CX,0C30H
	MOV AL,CH
	CALL DISP
	MOV AL,CL
	CALL DISP

	MOV AH,4CH
	INT 21H

	DISP PROC NEAR
		AAM
		ADD AX,3030H
		MOV BX,AX

		MOV DL,BH
		MOV AH,02H
		INT 21H

		MOV DL,BL
		MOV AH,02H
		INT 21H

		RET
	DISP ENDP

END
