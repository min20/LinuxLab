CC  = gcc 
CFLAGS  = -W -Wall
SRCS = $(wildcard *.c)
OBJS = $(SRCS:.c=.o)

all: test
	@echo "Build Success"

test: $(OBJS)
	${CC} ${CFLAGS} -o $@ $^ 

clean:
	rm -rf *.o test
	@echo "Remove Success"
