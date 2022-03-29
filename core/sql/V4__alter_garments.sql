ALTER TABLE [dbo].[garments]
    ADD [image] BIGINT NULL
    CONSTRAINT [image] FOREIGN KEY ([image]) REFERENCES [dbo].[images] ([ID])