CREATE TABLE [dbo].[constructo_user] (
    [ID]         INT           NOT NULL,
    [first_name] VARCHAR (50)  NOT NULL,
    [last_name]  VARCHAR (50)  NULL,
    [username]   VARCHAR (50)  NOT NULL,
    [email]      VARCHAR (100) NOT NULL,
    [password]   VARCHAR (1)   NOT NULL,
    CONSTRAINT [PK_constructo_user] PRIMARY KEY CLUSTERED ([ID] ASC)
    );