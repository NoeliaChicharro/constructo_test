CREATE TABLE [dbo].[garments] (
    [ID]           BIGINT       NOT NULL,
    [garment_type] VARCHAR (40) NULL,
    [name]         VARCHAR (1)  NOT NULL,
    [completed]    INT          NULL,
    [user]         INT          NOT NULL,
    CONSTRAINT [PK_garments] PRIMARY KEY CLUSTERED ([ID] ASC),
    CONSTRAINT [user] FOREIGN KEY ([user]) REFERENCES [dbo].[constructo_user] ([ID])
    );